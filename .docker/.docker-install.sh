# Linux - Ubuntu
```bash
# Docker 설치
sudo apt-get update
sudo apt-get install -y docker.io

# Docker 서비스 시작 및 부팅 시 자동 시작 설정
sudo systemctl start docker
sudo systemctl enable docker
```

## Windows - Chocolatey (installed by .install/.chocolatey/.chocolatey-install.sh)
```bash
choco install docker-desktop 
choco install docker-cli
```