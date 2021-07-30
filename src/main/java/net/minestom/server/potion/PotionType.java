package net.minestom.server.potion;

import net.minestom.server.registry.ProtocolObject;
import net.minestom.server.utils.NamespaceID;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;

@ApiStatus.NonExtendable
public interface PotionType extends ProtocolObject, PotionTypeConstants {

    static @NotNull Collection<@NotNull PotionType> values() {
        return PotionTypeImpl.values();
    }

    static @Nullable PotionType fromNamespaceId(@NotNull String namespaceID) {
        return PotionTypeImpl.get(namespaceID);
    }

    static @Nullable PotionType fromNamespaceId(@NotNull NamespaceID namespaceID) {
        return fromNamespaceId(namespaceID.asString());
    }

    static @Nullable PotionType fromId(int id) {
        return PotionTypeImpl.getId(id);
    }
}
