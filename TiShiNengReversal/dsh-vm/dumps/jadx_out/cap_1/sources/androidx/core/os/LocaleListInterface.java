package androidx.core.os;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
interface LocaleListInterface {
    java.util.Locale get(int r1);

    @androidx.annotation.Nullable
    java.util.Locale getFirstMatch(@androidx.annotation.NonNull java.lang.String[] r1);

    java.lang.Object getLocaleList();

    @androidx.annotation.IntRange(from = -1)
    int indexOf(java.util.Locale r1);

    boolean isEmpty();

    @androidx.annotation.IntRange(from = 0)
    int size();

    java.lang.String toLanguageTags();
}
