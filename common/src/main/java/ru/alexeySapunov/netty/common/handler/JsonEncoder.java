package ru.alexeySapunov.netty.common.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import ru.alexeySapunov.netty.common.message.Message;

public class JsonEncoder extends MessageToByteEncoder<Message> {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @Override
    protected void encode(ChannelHandlerContext ctx, Message msg, ByteBuf out) throws Exception {
        byte[] value = OBJECT_MAPPER.writeValueAsBytes(msg);
        out.writeBytes(value);
    }
}
