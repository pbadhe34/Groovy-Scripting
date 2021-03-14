package com.server

Thread.start
    {
        [1..9]*.each {
            sleep(10 * it) 
            println it
        }
    }
    
Thread.start
    {
     ["three","two", "one", "liftoff"].each {
            sleep(100) 
            println it
        }
    }
