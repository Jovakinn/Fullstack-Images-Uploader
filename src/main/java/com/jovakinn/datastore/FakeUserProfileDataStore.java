package com.jovakinn.datastore;

import com.jovakinn.profile.model.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("541ffe25-8287-453e-9021-43cfa46a8768"), "Jake", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("79f45ec1-67f1-4001-b837-e2875e2a8462"), "Sam", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
