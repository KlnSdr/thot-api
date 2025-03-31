package thot.api.payload;

import thot.api.command.KeyType;

import java.io.Serializable;

public class DeletePayload implements Serializable {
    private final String key;
    private final KeyType keyType;

    public DeletePayload(String key, KeyType keyType) {
        this.key = key;
        this.keyType = keyType;
    }

    public String getKey() {
        return key;
    }

    public KeyType getKeyType() {
        return keyType;
    }
}
