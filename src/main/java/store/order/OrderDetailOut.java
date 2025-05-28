package store.order;
import lombok.Builder;
import lombok.experimental.Accessors;


@Builder @Accessors(fluent = true)
public record OrderDetailOut (

    String id,
    String date,
    Double total
) {}
