package com.javajourney.lambda_expression;

import com.javajourney.comparator.Student;

public class Students {

        private int id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        private String name;
        public Students(int id, String name){
            this.id = id;
            this.name = name;
        }
        Students(Students s){
            this.id = s.id;
            this.name = s.name;

        }

        public String toString(){
            return this.name+" "+this.id;
        }


}
