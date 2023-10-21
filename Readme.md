# Deploy Spring-boot application in Aws EC2 via s3 file storage

     spring-boot->build jar->upload to s3 bukcet-> pull jar from ec2 instance->deploy to Ec2

- Build Spring-boot Application using maven
    
         mvn clean install     

         or

         mvn clean package


- upload jar to s3 storage

       go to aws s3 console and upload your jar

### pull jar from s3 bucket


        

	 if aws not configure configured it by 
	 
	  --aws configure  

	  then provide aws key and aws secreat key

        -- aws s3 cp <s3-uri> <destination-ec2-files>
        -- eg:   aws s3 cp s3://coins-s3-bucket-rtls/SpringBoot-App-Deployment-K8s-Aws-Eks.jar .

	-- if gettinng access issue, make sure u have all access AmazonS3ReadOnlyAccess


### Deploy to Ec2

       --  java -jar SpringBoot-App-Deployment-K8s-Aws-Eks.jar


       Make sure you installed  same java version tested in lower region 

    