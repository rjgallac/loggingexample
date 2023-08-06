

java -javaagent:elastic-apm-agent.jar -Delastic.apm.service_name=my-cool-service -Delastic.apm.application_packages=uk.co.sheffieldwebprogrammer.loggingexample -Delastic.apm.server_url=http://127.0.0.1:8200 -jar my-application.jar

