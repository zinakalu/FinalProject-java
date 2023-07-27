package VA.com.example.virtual.assistant;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class UserSerializer extends StdSerializer<User> {

    public UserSerializer() {
        this(null);
    }

    public UserSerializer(Class<User> t) {
        super(t);
    }

    @Override
    public void serialize(
            User user,
            JsonGenerator jgen,
            SerializerProvider provider)
            throws IOException {

        jgen.writeStartObject();
        jgen.writeNumberField("id", user.getid());
        jgen.writeStringField("username", user.getUsername());
        jgen.writeStringField("email", user.getEmail());

        jgen.writeEndObject();
    }

}
