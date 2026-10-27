package androidx.core.content;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class UriMatcherCompat {
    private UriMatcherCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ boolean a(android.content.UriMatcher r0, android.net.Uri r1) {
            int r0 = r0.match(r1)
            r1 = -1
            if (r0 == r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.core.util.Predicate<android.net.Uri> asPredicate(@androidx.annotation.NonNull android.content.UriMatcher r1) {
            androidx.core.content.x r0 = new androidx.core.content.x
            r0.<init>(r1)
            return r0
    }
}
