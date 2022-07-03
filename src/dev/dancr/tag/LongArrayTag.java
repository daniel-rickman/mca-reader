package dev.dancr.tag;

import dev.dancr.ByteUtils;

import java.io.DataInputStream;
import java.io.IOException;

public class LongArrayTag extends ArrayTag<Long> {

    public LongArrayTag(DataInputStream stream) throws IOException {
        super(stream, ByteUtils::toLongArray);
    }

    @Override
    public short getPayloadSize() {
        return Long.BYTES;
    }

    @Override
    public int getTagID() {
        return 12;
    }
}
