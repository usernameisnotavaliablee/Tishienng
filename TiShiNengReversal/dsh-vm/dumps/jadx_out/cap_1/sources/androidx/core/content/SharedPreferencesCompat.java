package androidx.core.content;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SharedPreferencesCompat {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.Deprecated
    public static final class EditorCompat {
        private static androidx.core.content.SharedPreferencesCompat.EditorCompat sInstance;
        private final androidx.core.content.SharedPreferencesCompat.EditorCompat.Helper mHelper;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static class Helper {
            Helper() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public void apply(@androidx.annotation.NonNull android.content.SharedPreferences.Editor r1) {
                    r0 = this;
                    r1.apply()     // Catch: java.lang.AbstractMethodError -> L4
                    return
                L4:
                    r1.commit()
                    return
            }
        }

        private EditorCompat() {
                r1 = this;
                r1.<init>()
                androidx.core.content.SharedPreferencesCompat$EditorCompat$Helper r0 = new androidx.core.content.SharedPreferencesCompat$EditorCompat$Helper
                r0.<init>()
                r1.mHelper = r0
                return
        }

        @java.lang.Deprecated
        public static androidx.core.content.SharedPreferencesCompat.EditorCompat getInstance() {
                androidx.core.content.SharedPreferencesCompat$EditorCompat r0 = androidx.core.content.SharedPreferencesCompat.EditorCompat.sInstance
                if (r0 != 0) goto Lb
                androidx.core.content.SharedPreferencesCompat$EditorCompat r0 = new androidx.core.content.SharedPreferencesCompat$EditorCompat
                r0.<init>()
                androidx.core.content.SharedPreferencesCompat.EditorCompat.sInstance = r0
            Lb:
                androidx.core.content.SharedPreferencesCompat$EditorCompat r0 = androidx.core.content.SharedPreferencesCompat.EditorCompat.sInstance
                return r0
        }

        @java.lang.Deprecated
        public void apply(@androidx.annotation.NonNull android.content.SharedPreferences.Editor r2) {
                r1 = this;
                androidx.core.content.SharedPreferencesCompat$EditorCompat$Helper r0 = r1.mHelper
                r0.apply(r2)
                return
        }
    }

    private SharedPreferencesCompat() {
            r0 = this;
            r0.<init>()
            return
    }
}
