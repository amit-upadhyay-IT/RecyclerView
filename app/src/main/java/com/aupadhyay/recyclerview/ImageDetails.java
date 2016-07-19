package com.aupadhyay.recyclerview;

/**
 * Created by aupadhyay on 7/19/16.
 */
public class ImageDetails {

    private int image;
    private String imageDetails;

    public ImageDetails(int image, String imageDetails) {
        this.image = image;
        this.imageDetails = imageDetails;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getImageDetails() {
        return imageDetails;
    }

    public void setImageDetails(String imageDetails) {
        this.imageDetails = imageDetails;
    }

    @Override
    public String toString() {
        return  "You Click on ='" + imageDetails ;
    }
}
