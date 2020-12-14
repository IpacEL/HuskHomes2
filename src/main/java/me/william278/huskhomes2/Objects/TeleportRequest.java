package me.william278.huskhomes2.Objects;

import me.william278.huskhomes2.Main;

import java.time.Instant;

public class TeleportRequest {

    String senderName;
    long requestExpiryTime;
    String requestType;

    public TeleportRequest(String senderName, String requestType) {
        this.senderName = senderName;
        if (requestType.equalsIgnoreCase("tpa") || requestType.equalsIgnoreCase("tpahere")) {
            this.requestType = requestType.toLowerCase();
        }
        long currentUnixTime = Instant.now().getEpochSecond();
        requestExpiryTime = currentUnixTime + Main.settings.getTeleportRequestExpiryTime();
    }

    public String getSenderName() {
        return senderName;
    }

    public String getRequestType() {
        return requestType;
    }

    public boolean getExpired() {
        long currentUnixTime = Instant.now().getEpochSecond();
        return currentUnixTime > requestExpiryTime;
    }
}