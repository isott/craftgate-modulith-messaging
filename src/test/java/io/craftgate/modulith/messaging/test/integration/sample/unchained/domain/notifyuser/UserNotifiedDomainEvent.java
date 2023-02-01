package io.craftgate.modulith.messaging.test.integration.sample.unchained.domain.notifyuser;

import io.craftgate.modulith.messaging.api.annotation.MessageType;
import io.craftgate.modulith.messaging.api.model.Message;
import io.craftgate.modulith.messaging.test.integration.sample.unchained.domain.shared.User;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@MessageType(name = "USER_NOTIFIED")
public class UserNotifiedDomainEvent extends Message {

    private String username;

    public static Message of(User user) {
        return UserNotifiedDomainEvent.builder()
                .username(user.getUsername())
                .build();
    }
}
