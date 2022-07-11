package com.jovakinn.profile.model;

import java.util.Optional;
import java.util.UUID;

public class UserProfile {

    private final UUID userProfileId;
    private final String username;
    private String userProfileImageLink;

    public UserProfile(UUID userProfileId, String username, String userProfileImageLink) {
        this.userProfileId = userProfileId;
        this.username = username;
        this.userProfileImageLink = userProfileImageLink;
    }

    public UUID getUserProfileId() {
        return userProfileId;
    }

    public String getUsername() {
        return username;
    }

    public Optional<String> getUserProfileImageLink() {
        return Optional.ofNullable(userProfileImageLink);
    }

    public void setUserProfileImageLink(String userProfileImageLink) {
        this.userProfileImageLink = userProfileImageLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserProfile that = (UserProfile) o;

        if (getUserProfileId() != null ? !getUserProfileId().equals(that.getUserProfileId()) : that.getUserProfileId() != null)
            return false;
        if (getUsername() != null ? !getUsername().equals(that.getUsername()) : that.getUsername() != null)
            return false;
        return getUserProfileImageLink().isPresent() ? getUserProfileImageLink().equals(that.getUserProfileImageLink()) : !that.getUserProfileImageLink().isPresent();
    }

    @Override
    public int hashCode() {
        int result = getUserProfileId() != null ? getUserProfileId().hashCode() : 0;
        result = 31 * result + (getUsername() != null ? getUsername().hashCode() : 0);
        result = 31 * result + (getUserProfileImageLink().isPresent() ? getUserProfileImageLink().hashCode() : 0);
        return result;
    }
}
