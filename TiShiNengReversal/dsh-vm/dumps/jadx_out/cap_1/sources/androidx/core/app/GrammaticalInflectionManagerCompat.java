package androidx.core.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class GrammaticalInflectionManagerCompat {
    public static final int GRAMMATICAL_GENDER_FEMININE = 2;
    public static final int GRAMMATICAL_GENDER_MASCULINE = 3;
    public static final int GRAMMATICAL_GENDER_NEUTRAL = 1;
    public static final int GRAMMATICAL_GENDER_NOT_SPECIFIED = 0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(34)
    static class Api34Impl {
        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static int getApplicationGrammaticalGender(android.content.Context r0) {
                android.app.GrammaticalInflectionManager r0 = getGrammaticalInflectionManager(r0)
                int r0 = r0.getApplicationGrammaticalGender()
                return r0
        }

        private static android.app.GrammaticalInflectionManager getGrammaticalInflectionManager(android.content.Context r1) {
                java.lang.Class<android.app.GrammaticalInflectionManager> r0 = android.app.GrammaticalInflectionManager.class
                java.lang.Object r1 = r1.getSystemService(r0)
                android.app.GrammaticalInflectionManager r1 = (android.app.GrammaticalInflectionManager) r1
                return r1
        }

        @androidx.annotation.DoNotInline
        static void setRequestedApplicationGrammaticalGender(android.content.Context r0, int r1) {
                android.app.GrammaticalInflectionManager r0 = getGrammaticalInflectionManager(r0)
                r0.setRequestedApplicationGrammaticalGender(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public @interface GrammaticalGender {
    }

    private GrammaticalInflectionManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.AnyThread
    @androidx.annotation.OptIn(markerClass = {androidx.core.os.BuildCompat.PrereleaseSdkCheck.class})
    public static int getApplicationGrammaticalGender(@androidx.annotation.NonNull android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            int r2 = androidx.core.app.GrammaticalInflectionManagerCompat.Api34Impl.getApplicationGrammaticalGender(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    @androidx.annotation.AnyThread
    @androidx.annotation.OptIn(markerClass = {androidx.core.os.BuildCompat.PrereleaseSdkCheck.class})
    public static void setRequestedApplicationGrammaticalGender(@androidx.annotation.NonNull android.content.Context r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L9
            androidx.core.app.GrammaticalInflectionManagerCompat.Api34Impl.setRequestedApplicationGrammaticalGender(r2, r3)
        L9:
            return
    }
}
