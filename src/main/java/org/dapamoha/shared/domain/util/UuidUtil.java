package org.dapamoha.shared.domain.util;

import java.util.UUID;
import org.springframework.stereotype.Component;

@Component
public class UuidUtil {

    public UUID randomUUID() {
        return UUID.randomUUID();
    }
}
