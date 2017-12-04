## JavaScript editing with Intellisense
src/main/resources
npm install @types/angular

## debug
mvn package
java -Xdebug \
   -Xrunjdwp:server=y,transport=dt_socket,address=8000,suspend=n \
   -jar target/todo-app-java-on-azure-1.0-SNAPSHOT.jar
Listening for transport dt_socket at address: 8000

why no launch configuration and only attach?


## Demo

- Show the app
    - local host 8080
- Inside the app
    - angular frontend, spring restController provides access to an azure Cosmos DB
        Cosmos noSQL, document db, understands the mongo API
    - created from a spring starter, adds Azure Cosmose DB, there are many azure spring starters available now

- Show the extensions
    - Java extensions -> Java extension pack
        language server
        debug
        JUnit support -> just became available last week
    - Spring extension pack -> will see more about it during the conference
    - Cosmos -> show todo-app - spring one demo db
        want to have access to my resources from the editor
- FrontEnd (code is a great full stack developer tool)
    - todo list controller
        - show hovering
        - show intellisense on controller -> go to definition, show TS type annotations
        - quick open
        (mention ligatures)
        - extract handle success function

Backend
- Use spring boot for Java for navigation
- use explorer, prefer semantic navigation 
    cmd-T all types -> ApplicationController
    cmd-T @+   # all types, all annotations, all beans (contributed by springboot java extension) -> test controller bean
    cmd-shift-o symbols in documents
    cmd-shift-o/ all request mappings/end points
- Goto the post endPoint
    - extract method
- cmd-hover over ToDo item
    - code lense for search method is used in 2 other methods
- Zone actions to run tests
    - make test stronger
    - assertThat(item.isFinished(), is(not(true)));  (option-delete to delete word)
    - show git peek, and changes in explorer
- go back to controller run & debug the thing locally
    - task package -> runs mvn package
    - task start server
    - F5 attach debugger
- Add item in browser
    - step, hover
- Deploy to azure or cloud foundary
- show slide with other talks


