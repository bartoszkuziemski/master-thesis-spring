#!/bin/bash

SCRIPTPATH="$( cd -- "$(dirname "$0")" >/dev/null 2>&1 ; pwd -P )"

docker run -it -v $SCRIPTPATH/volume:/benchmarks:Z -v $SCRIPTPATH/tmp/reports:/tmp/reports:Z --network=host quay.io/hyperfoil/hyperfoil cli

#start-local && upload /benchmarks/benchmark.hf.yaml && run benchmark

# step 1 run: start-local
# step 2 run (Run this every time the file is modified): upload /benchmarks/benchmark.hf.yaml
# step 3 run: run benchmark
# step 4 run: stats
# step 5 run: report --destination=/tmp/reports

docker run --rm -it -v C:\Users\BartoszKuziemski\IdeaProjects\master-thesis-spring\hyperfoil:/hyperfoil quay.io/hyperfoil/hyperfoil cli

docker run -p 8080:8083 --rm -it -v C:\Users\BartoszKuziemski\IdeaProjects\master-thesis-spring\hyperfoil:/hyperfoil quay.io/hyperfoil/hyperfoil cli

docker run --rm -it -v C:\Users\BartoszKuziemski\IdeaProjects\master-thesis-spring\hyperfoil:/hyperfoil --network=host quay.io/hyperfoil/hyperfoil cli


./wrk -t100 -c1000 -d60s -R2000 --u_latency http://localhost:8081/products
./wrk -s tests/test.lua -d60s -R2000 --u_latency http://localhost:8081
