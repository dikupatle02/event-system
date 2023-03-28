package com.bootcoding.spring;

import org.springframework.stereotype.Component;

@Component
public class College {
        private Students s;
        private Department d;
        private Teacher t;
        private Result r;

        public College(Students s,Department d,Teacher t,Result r){
                this.s = s;
                this.d = d;
                this.t = t;
                this.r = r;
        }




}
