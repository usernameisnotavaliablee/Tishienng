package pl.droidsonroids.gif;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class GifIOException extends java.io.IOException {
    private static final long serialVersionUID = 13038402904505L;
    private final java.lang.String mErrnoMessage;

    @androidx.annotation.NonNull
    public final pl.droidsonroids.gif.GifError reason;

    GifIOException(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            pl.droidsonroids.gif.GifError r1 = pl.droidsonroids.gif.GifError.fromCode(r1)
            r0.reason = r1
            r0.mErrnoMessage = r2
            return
    }

    static pl.droidsonroids.gif.GifIOException fromCode(int r2) {
            pl.droidsonroids.gif.GifError r0 = pl.droidsonroids.gif.GifError.NO_ERROR
            int r0 = r0.errorCode
            r1 = 0
            if (r2 != r0) goto L8
            return r1
        L8:
            pl.droidsonroids.gif.GifIOException r0 = new pl.droidsonroids.gif.GifIOException
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
            r2 = this;
            java.lang.String r0 = r2.mErrnoMessage
            if (r0 != 0) goto Lb
            pl.droidsonroids.gif.GifError r0 = r2.reason
            java.lang.String r0 = r0.getFormattedDescription()
            return r0
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            pl.droidsonroids.gif.GifError r1 = r2.reason
            java.lang.String r1 = r1.getFormattedDescription()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.String r1 = r2.mErrnoMessage
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
