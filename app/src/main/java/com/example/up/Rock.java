package com.example.up;

import android.net.Uri;

public class Rock {
        private Long id;
        private Integer price;
        private Integer image;
        private String title;
        private String description;
        public Rock(Long id, Integer price, int  image, String title, String description){

        this.id = id;
        this.price = price;
        this.image = image;
        this.title = title;
        this.description = description;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }

        public int getImage() {
            return image;
        }

        public void setImage(int image) {
            this.image = image;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

}
