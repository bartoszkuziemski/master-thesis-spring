./wrk -t100 -c1000 -d60s -R2000 --u_latency http://localhost:8081/products
./wrk -t20 -c100 -d60s -R100 -s post_product.lua --u_latency http://localhost:8081/products
./wrk -t100 -c100 -d60s -R2000 -s post_product.lua --u_latency http://localhost:8081/products
