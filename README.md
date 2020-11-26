
# DevOps Playground 001

## Hands on with Jenkins, Terraform, AWS and React

I am part of the DevOps Playground group on Meetup and I attended their webinar "Hands on with Jenkins, Terraform, AWS
and React" to get an introduction on how to build an automated pipleline which deploys a scalable React web app to AWS.

### What was covered

- Writing a Jenkins DSL script - allowing us to define our pipeline configuration as code (Pipeline as Code).
- Triggering a build of this script which created a new, empty pipeline that was configured with all the settings we needed.
- Writing *another* script for the newly created pipeline which defined the various stages our application needed to go through before being deployed to AWS. These included:
    - Building the application.
    - Testing it.
    - Deploying it to an AWS autoscaling group using terraform (Infrastructure as Code).


### Link to deployed app

http://playground-gelding-2012902464.eu-west-2.elb.amazonaws.com/