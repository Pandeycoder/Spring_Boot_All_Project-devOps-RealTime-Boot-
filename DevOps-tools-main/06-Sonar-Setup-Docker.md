## Step-1 : Setup Linux VM (Amazon Linux AMI)

1) Login into AWS Cloud account
2) Launch Linux VM using EC2 service   
     - AMI : Amazon Linux
     - Instance Type : t2.medium       
4) Connect to VM using MobaXterm

## Step-2 : Install Docker In Linux VM

```
sudo yum update -y 
sudo yum install docker -y
sudo service docker start
sudo usermod -aG docker ec2-user
exit
```
## Step-3 : Rress 'R' to restart the session (This is in MobaXterm)

## Step-4 :  Verify docker installation
```
docker -v
```
## Step-5 : Run SonarQube using docker image
```
docker run -d --name sonarqube -p 9000:9000 -p 9092:9092 sonarqube:lts-community
```

## Step-6: Enable 9000 port number in Security Group Inbound Rules & Access Sonar Server
```
 - URL : http://public-ip:9000/
```

# UBUNTU------------------------------------------------------------------------------------
## Step 1: Setup Linux VM (Ubuntu)
Login to AWS Cloud account.
Launch an Ubuntu VM using EC2 service:
AMI: Ubuntu Server 20.04 LTS (or a newer version).
Instance Type: t2.medium (or higher, depending on your needs).
Connect to the VM using MobaXterm or SSH client.

## Step 2: Install Docker on Ubuntu
Run the following commands in the terminal to install Docker:


sudo apt update -y
sudo apt upgrade -y
sudo apt install -y docker.io
sudo systemctl start docker
sudo systemctl enable docker
sudo usermod -aG docker ubuntu
exit
## Step 3: Restart the session
Reconnect to the VM using MobaXterm or SSH client.
Step 4: Verify Docker Installation
Run the following command:


docker -v
You should see the Docker version displayed, confirming the installation.

## Step 5: Run SonarQube using Docker
Execute the following command to download and run SonarQube as a Docker container:


docker run -d --name sonarqube -p 9000:9000 -p 9092:9092 sonarqube:lts-community

## Step 6: Configure Security Group to Allow Port 9000
In the AWS Management Console:

Go to EC2 > Security Groups.
Edit the Inbound Rules for the security group attached to your EC2 instance.
Add a rule to allow HTTP traffic on port 9000 from 0.0.0.0/0 (or a specific IP range).
Save the changes.

## Step 7: Access SonarQube
Open a browser and navigate to:
http://<public-ip>:9000/
