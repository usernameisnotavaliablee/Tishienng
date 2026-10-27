package okhttp3.internal.ws;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class MessageDeflaterKt {

    @org.jetbrains.annotations.NotNull
    private static final okio.ByteString EMPTY_DEFLATE_BLOCK = null;
    private static final int LAST_OCTETS_COUNT_TO_REMOVE_AFTER_DEFLATION = 4;

    static {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = "000000ffff"
            okio.ByteString r0 = r0.decodeHex(r1)
            okhttp3.internal.ws.MessageDeflaterKt.EMPTY_DEFLATE_BLOCK = r0
            return
    }

    public MessageDeflaterKt() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final /* synthetic */ okio.ByteString access$getEMPTY_DEFLATE_BLOCK$p() {
            okio.ByteString r0 = okhttp3.internal.ws.MessageDeflaterKt.EMPTY_DEFLATE_BLOCK
            return r0
    }
}
