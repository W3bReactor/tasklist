# Some useful information

## Diagrams

https://www.plantuml.com/plantuml/uml/

## Sequence Diagram

@startuml
actor Client as Client
Client -> Controller : request
Controller -> Service : request
Service -> Cache : request
Cache --> Service : response if cache exists
Service --> Controller : response
Controller --> Client : response
Service -> Repository : request
database Database as Database
Repository -> Database : request
Database --> Repository : response
Repository --> Service : response
Service --> Cache : cache response
Service --> Controller : response
Controller --> Client : response
@enduml

## Component Diagram

@startuml
component [Server] as Server
component [Cache] as Cache
component [Storage] as Storage
component [Database] as Database

Server -down->Cache
Server -up->Storage
Server -> Database
@enduml