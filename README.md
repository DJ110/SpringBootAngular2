Spring Boot + Angular2 + Webpack
====
## Overview
This is Spring Boot(backend) and Angular2(frontend) application example.
Angular2 is built by webpack

## Requirement
[Spring Boot](https://projects.spring.io/spring-boot/)
[Angular 2](https://angular.io/)
[node](https://nodejs.org/en/)
[webpack](https://webpack.github.io/)
[typescript](https://www.typescriptlang.org/)

## Directory
    BestPractice
         |- build.gradle
         |- src
             |- main
                  |- java                    : Java
                  |- resources
                  |      |- application.yml
                  |- ui                      : Front end root
                     |- src                  : Font end src files
                     |- package.json
                     |- tsconfig.json
                     |- webpack.config.js
                     |- config               : config files


## Build UI(run on the local)
    $ cd src/main/ui
    $ npm install
    $ npm start

npm install is only one time to install dependencies

## Build UI(for pro)
    $ cd src/main/ui
    $ npm install
    $ npm run build

npm install is only one time to install dependencies

## Run
After build UI as pro, start Main class of Java

## License
* MIT
    * see LICENSE

## Author
[DJ110](http://atmarkplant.com)