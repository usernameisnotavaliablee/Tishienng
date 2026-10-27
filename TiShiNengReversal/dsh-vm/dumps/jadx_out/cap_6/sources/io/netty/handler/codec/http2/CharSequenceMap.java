package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class CharSequenceMap<V> extends io.netty.handler.codec.DefaultHeaders<java.lang.CharSequence, V, io.netty.handler.codec.http2.CharSequenceMap<V>> {
    public CharSequenceMap() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    public CharSequenceMap(boolean r2) {
            r1 = this;
            io.netty.handler.codec.UnsupportedValueConverter r0 = io.netty.handler.codec.UnsupportedValueConverter.instance()
            r1.<init>(r2, r0)
            return
    }

    public CharSequenceMap(boolean r1, io.netty.handler.codec.ValueConverter<V> r2) {
            r0 = this;
            if (r1 == 0) goto L5
            io.netty.util.HashingStrategy r1 = io.netty.util.AsciiString.CASE_SENSITIVE_HASHER
            goto L7
        L5:
            io.netty.util.HashingStrategy r1 = io.netty.util.AsciiString.CASE_INSENSITIVE_HASHER
        L7:
            r0.<init>(r1, r2)
            return
    }

    public CharSequenceMap(boolean r2, io.netty.handler.codec.ValueConverter<V> r3, int r4) {
            r1 = this;
            if (r2 == 0) goto L5
            io.netty.util.HashingStrategy r2 = io.netty.util.AsciiString.CASE_SENSITIVE_HASHER
            goto L7
        L5:
            io.netty.util.HashingStrategy r2 = io.netty.util.AsciiString.CASE_INSENSITIVE_HASHER
        L7:
            io.netty.handler.codec.DefaultHeaders$NameValidator r0 = io.netty.handler.codec.DefaultHeaders.NameValidator.NOT_NULL
            r1.<init>(r2, r3, r0, r4)
            return
    }
}
