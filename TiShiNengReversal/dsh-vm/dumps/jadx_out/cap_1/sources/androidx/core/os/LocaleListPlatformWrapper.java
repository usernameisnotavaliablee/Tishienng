package androidx.core.os;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(24)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class LocaleListPlatformWrapper implements androidx.core.os.LocaleListInterface {
    private final android.os.LocaleList mLocaleList;

    LocaleListPlatformWrapper(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            android.os.LocaleList r1 = androidx.core.os.b.a(r1)
            r0.mLocaleList = r1
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            android.os.LocaleList r0 = r1.mLocaleList
            androidx.core.os.LocaleListInterface r2 = (androidx.core.os.LocaleListInterface) r2
            java.lang.Object r2 = r2.getLocaleList()
            boolean r2 = androidx.appcompat.app.d.a(r0, r2)
            return r2
    }

    @Override // androidx.core.os.LocaleListInterface
    public java.util.Locale get(int r2) {
            r1 = this;
            android.os.LocaleList r0 = r1.mLocaleList
            java.util.Locale r2 = androidx.core.os.f.a(r0, r2)
            return r2
    }

    @Override // androidx.core.os.LocaleListInterface
    @androidx.annotation.Nullable
    public java.util.Locale getFirstMatch(@androidx.annotation.NonNull java.lang.String[] r2) {
            r1 = this;
            android.os.LocaleList r0 = r1.mLocaleList
            java.util.Locale r2 = androidx.core.os.c.a(r0, r2)
            return r2
    }

    @Override // androidx.core.os.LocaleListInterface
    public java.lang.Object getLocaleList() {
            r1 = this;
            android.os.LocaleList r0 = r1.mLocaleList
            return r0
    }

    public int hashCode() {
            r1 = this;
            android.os.LocaleList r0 = r1.mLocaleList
            int r0 = androidx.core.os.g.a(r0)
            return r0
    }

    @Override // androidx.core.os.LocaleListInterface
    public int indexOf(java.util.Locale r2) {
            r1 = this;
            android.os.LocaleList r0 = r1.mLocaleList
            int r2 = androidx.core.os.h.a(r0, r2)
            return r2
    }

    @Override // androidx.core.os.LocaleListInterface
    public boolean isEmpty() {
            r1 = this;
            android.os.LocaleList r0 = r1.mLocaleList
            boolean r0 = androidx.appcompat.app.s.a(r0)
            return r0
    }

    @Override // androidx.core.os.LocaleListInterface
    public int size() {
            r1 = this;
            android.os.LocaleList r0 = r1.mLocaleList
            int r0 = androidx.core.os.d.a(r0)
            return r0
    }

    @Override // androidx.core.os.LocaleListInterface
    public java.lang.String toLanguageTags() {
            r1 = this;
            android.os.LocaleList r0 = r1.mLocaleList
            java.lang.String r0 = androidx.appcompat.app.h.a(r0)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            android.os.LocaleList r0 = r1.mLocaleList
            java.lang.String r0 = androidx.core.os.e.a(r0)
            return r0
    }
}
