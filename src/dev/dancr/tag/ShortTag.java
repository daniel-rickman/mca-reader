package dev.dancr.tag;

import dev.dancr.ByteUtils;

import java.io.DataInputStream;
import java.io.IOException;

public class ShortTag extends NumberTag<Short> {

    public ShortTag(DataInputStream stream) throws IOException {
        super(stream, ByteUtils::toShort);
    }

    @Override
    public int getTagID() {
        return 2;
    }

    @Override
    public short getPayloadSize() {
        return Short.BYTES;
    }
}
