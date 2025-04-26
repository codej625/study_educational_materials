# 테스트 서버

<br />
<br />

* 여러 실험을 위한 테스트 서버 구축
---

```
여러가지 서버와 디비를 테스트하기 위한,
테스트 서버입니다.
```

<br />
<br />
<br />
<br />

1. 스택

```
DB: PostgreSQL, Redis

Language: Java, Javascript, Python(예정)

Framework: Spring Boot, Nest, Next, FastAPI(예정)

Library: React

DevOps: Docker, K8s, GitHub Action, Jenkins

OS: Linux, macOS, Windows 11
```

<br />
<br />
<br />

2. 테스트 1-1

```
여러 가지 환경에서 잡다하고,
간단한 테스트를 하기 위한 테스트 서버 구축.

회사 테스트 서버(Host)를 VPN으로 접속한다.

OS는 Ubuntu(Linux)를 사용하고,
DB(PostgreSQL), WAS(Nest), Web Server(Nginx)를 사용한다.

DB는 이미지로 미리 서버에 컨테이너로 띄어놓고,
앱서버는 gitHub와 Jenkins를 사용해서 빌드하고 관리한다.
```

```
1. Ubuntu 버전은 20.04 LTS이다.

2. macOS에서는 터미널을 열고, 
   ssh ubuntu@192.168.140.139 이렇게 접속한다. (비번은 12341234aA! 어차피 VPN 없으면 접속 X)

3. 컨테이너 관리를 위해 Docker, Jenkins를 설치한다.
```

```
// Docker 설치

1) sudo apt update

2) sudo apt install -y ca-certificates curl gnupg

3) sudo install -m 0755 -d /etc/apt/keyrings

4) curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo gpg --dearmor -o /etc/apt/keyrings/docker.gpg

5) sudo chmod a+r /etc/apt/keyrings/docker.gpg

6) echo \
  "deb [arch=$(dpkg --print-architecture) signed-by=/etc/apt/keyrings/docker.gpg] https://download.docker.com/linux/ubuntu \
  $(lsb_release -cs) stable" | sudo tee /etc/apt/sources.list.d/docker.list > /dev/null

7) sudo apt update

8) sudo apt install -y docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin
```

```
// 설명

sudo apt update: 패키지 목록을 업데이트한다.

sudo apt install -y ca-certificates curl gnupg: Docker 저장소 접근에 필요한 패키지를 설치한다.

curl ... | sudo gpg ...: Docker의 공식 GPG 키를 다운로드하고 등록한다.

echo ... | sudo tee ...: Docker 저장소 정보를 APT 소스 목록에 추가한다.

sudo apt update: 다시 패키지 목록을 업데이트한다.

sudo apt install -y docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin: Docker Engine, CLI, Containerd, Buildx 플러그인, Compose 플러그인을 설치한다.
```

```
4. sudo systemctl status docker // 서비스가 정상적으로 실행되고 있는지 확인

5. sudo systemctl start docker // 혹시나 서비스가 실행되고 있지 않을 때

6. sudo systemctl enable docker // 부팅 시, Docker 서비스가 자동으로 시작되도록 설정 (옵션)

7. docker pull postgres:16 // PostgreSQL 16 안정화 버전 이미지를 받는다.
```

```
8. --name postgres-16-db -p 5432:5432 
   -e POSTGRES_USER=<사용자_이름> // codej625
   -e POSTGRES_PASSWORD=<비밀번호> // 0000
   -e POSTGRES_DB=<데이터베이스_이름> // ex) test_db
   -v postgres_16_data:/var/lib/postgresql/data
   postgres:16
   // 위의 명령어로 다운받은 이미지를 컨테이너로 실행
```

```
9. docker ps // 실행 중인 컨테이너를 확인한다.

10. 로컬에서는 DB Server를 접속하기 위해 pgAdmin 4를 설치한다.

11. Server를 만들고, 도커로 띄어놓은 컨테이너에 접속한다. // ex) test-server

12. 혹시나 뭔가 위의 과정이 망했다면, docker rm <my-container> 명령어로 컨테이너를 삭제한다.
    (docker volume rm my-removable-volume 이건 볼륨 삭제 커맨드이다.)
```

```
13. Jenkins를 설치하기 위해선 JDK가 필요하다.
    sudo apt update
    sudo apt install openjdk-17-jdk // LTS 버전으로 설치한다.
    sudo apt install openjdk-17-jre // 혹은 런타임만 깔아도 문제 없다.
    (JAVA_HOME을 꼭 확인해야 한다.)

14. Jenkins 공식 저장소 추가 및 Jenkins 설치
    https://www.jenkins.io/doc/book/installing/linux/#debianubuntu
    위의 주소를 참고하는 게 AI에 물어보는 것보다 정확하다.

15. sudo systemctl status jenkins // Jenkins가 잘 설치되었는지 확인

16. Jenkins 기본 포트 허용하기
    sudo ufw allow 8080
    sudo ufw enable
    your-ubuntu-ip:your-jenkins-port/pluginManager/available 접속한다.

17. Jenkins 초기 비밀번호 확인
    sudo cat /var/lib/jenkins/secrets/initialAdminPassword
    비밀번호를 확인하고 이후 비밀번호를 변경한다.

18. GitHub 연동을 위해 플러그인을 설치한다.
    GitHub Integration 을 검색하고 설치
```

<br />
<br />
<br />

3. 테스트 1-2

```
Nest.js에는 Prisma라는 강력한 ORM이 있다.

세팅을 해보자.
```

```npm
// 프로젝트 루트 폴더에서 실행 (NPM)
npm install prisma --save-dev
npm install @prisma/client

or

# (Yarn)
yarn add prisma --save-dev
yarn add @prisma/client
```

```npm
npx prisma init

// 또는 yarn 사용 시
// yarn prisma init
```

<br />

`.env 파일 설정`

```
생성된 .env 파일에 데이터베이스 연결 URL을 입력한다. 

prisma init 실행 시 어떤 데이터베이스를 사용할지 선택했다면, 
해당 데이터베이스의 기본 URL 형식이 주석으로 제공된다. 

PostgreSQL 예시는 다음과 같다.
```

```
DATABASE_URL="postgresql://username:password@host:port/database?schema=public"
```

<br />

`prisma 파일 설정`

```
생성된 schema.prisma 파일에서 datasource 블록의 provider가 사용하려는 데이터베이스에 맞게 설정되어 있는지 확인한다. 

PostgreSQL의 경우 provider = "postgresql"로 되어 있어야 한다.
```

```
// prisma/schema.prisma

datasource db {
  provider = "postgresql" // PostgreSQL 사용 시 확인
  url      = env("DATABASE_URL")
}

generator client {
  provider = "prisma-client-js"
  // previewFeatures = ["extendedWhereUnique"] // 필요한 경우 preview 기능 추가
}

// 여기에 데이터 모델을 정의한다. (다음 단계에서 설명)
```

```
// prisma/schema.prisma

// ... (datasource 및 generator 블록)

model User {
  id        Int       @id @default(autoincrement()) // 기본 키, 자동 증가
  email     String    @unique // 이메일 필드, 유니크 제약 조건
  name      String?   // 문자열 필드, null 허용 (?)
  password  String
  createdAt DateTime  @default(now()) // 생성 시간, 기본값은 현재 시간
  updatedAt DateTime  @updatedAt // 업데이트 시간, 데이터 수정 시 자동 업데이트
  posts     Post[]    // User와 Post 간의 1 대 다 관계 (User 하나가 여러 Post를 가짐)
}

model Post {
  id        Int       @id @default(autoincrement())
  title     String    @db.VarChar(255) // 필드 타입 및 데이터베이스 컬럼 타입 지정
  content   String?
  published Boolean   @default(false)
  createdAt DateTime  @default(now())
  updatedAt DateTime  @updatedAt
  author    User      @relation(fields: [authorId], references: [id]) // Post와 User 간의 다 대 1 관계
  authorId  Int       // User 모델과의 관계를 위한 외래 키 필드
}
```

```
스키마 파일을 변경하거나 처음 정의했다면, 
npx prisma migrate dev 명령어를 실행하여 데이터베이스에 스키마 변경 내용을 반영하고 Prisma Client 코드를 재생성해야 한다.
```

```
npx prisma migrate dev --name initial_setup
```

```
// 에러가 난다면?

# Prisma 캐시 삭제
npx prisma cache clean

# 다시 마이그레이션 실행
npx prisma migrate dev --name add_user_model
```