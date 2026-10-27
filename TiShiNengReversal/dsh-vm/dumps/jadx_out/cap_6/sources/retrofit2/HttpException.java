package retrofit2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class HttpException extends java.lang.RuntimeException {
    private final int code;
    private final java.lang.String message;
    private final transient retrofit2.c0<?> response;

    public HttpException(retrofit2.c0<?> r2) {
            r1 = this;
            java.lang.String r0 = getMessage(r2)
            r1.<init>(r0)
            int r0 = r2.b()
            r1.code = r0
            java.lang.String r0 = r2.h()
            r1.message = r0
            r1.response = r2
            return
    }

    private static java.lang.String getMessage(retrofit2.c0<?> r2) {
            java.lang.String r0 = "response == null"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "HTTP "
            r0.append(r1)
            int r1 = r2.b()
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r2 = r2.h()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public int code() {
            r1 = this;
            int r0 = r1.code
            return r0
    }

    public java.lang.String message() {
            r1 = this;
            java.lang.String r0 = r1.message
            return r0
    }

    @javax.annotation.Nullable
    public retrofit2.c0<?> response() {
            r1 = this;
            retrofit2.c0<?> r0 = r1.response
            return r0
    }
}
