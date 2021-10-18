package com.example.narsinghjan.API_DATA;

import java.util.ArrayList;

public class PostPojo {
    public class Codebeautify {
        Info InfoObject;
        ArrayList < Object > item = new ArrayList< Object >();


        // Getter Methods

        public Info getInfo() {
            return InfoObject;
        }

        // Setter Methods

        public void setInfo(Info infoObject) {
            this.InfoObject = infoObject;
        }
    }
    public class Info {
        private String _postman_id;
        private String name;
        private String schema;


        // Getter Methods

        public String get_postman_id() {
            return _postman_id;
        }

        public String getName() {
            return name;
        }

        public String getSchema() {
            return schema;
        }

        // Setter Methods

        public void set_postman_id(String _postman_id) {
            this._postman_id = _postman_id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSchema(String schema) {
            this.schema = schema;
        }
    }
}
