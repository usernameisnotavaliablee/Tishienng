package androidx.core.content;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SharedPreferencesKt {
    @android.annotation.SuppressLint({"ApplySharedPref"})
    public static final void edit(@org.jetbrains.annotations.NotNull android.content.SharedPreferences r0, boolean r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.content.SharedPreferences.Editor, kotlin.n1> r2) {
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r2.invoke(r0)
            if (r1 == 0) goto Ld
            r0.commit()
            return
        Ld:
            r0.apply()
            return
    }

    public static /* synthetic */ void edit$default(android.content.SharedPreferences r0, boolean r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L5
            r1 = 0
        L5:
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r2.invoke(r0)
            if (r1 == 0) goto L12
            r0.commit()
            return
        L12:
            r0.apply()
            return
    }
}
