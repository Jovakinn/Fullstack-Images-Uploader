package com.jovakinn.bucket;

public enum BucketName {
    PROFILE_IMAGE("jovakinn-image-uploader");

    private final String name;

    BucketName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
