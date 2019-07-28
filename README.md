Augorama
=======

A prototype-based actor system for tracking digital twin state via json and xml telemetry.

#UNDER CONSTRUCTION
#UNDER CONSTRUCTION
#UNDER CONSTRUCTION

to test:

`sbt test`

to package:

```
sbt assembly
docker build -t Augorama .
```
to generate and view code coverage reports:

```
sbt clean coverage test
sbt coverageReport
open target/scala-2.12/scoverage-report/index.html
```

for code stats:

```
sbt stats
```
