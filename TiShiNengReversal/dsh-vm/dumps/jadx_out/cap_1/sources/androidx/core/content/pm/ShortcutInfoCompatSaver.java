package androidx.core.content.pm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class ShortcutInfoCompatSaver<T> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static class NoopImpl extends androidx.core.content.pm.ShortcutInfoCompatSaver<java.lang.Void> {
        public NoopImpl() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.core.content.pm.ShortcutInfoCompatSaver
        public /* bridge */ /* synthetic */ java.lang.Void addShortcuts(java.util.List r1) {
                r0 = this;
                java.lang.Void r1 = r0.addShortcuts2(r1)
                return r1
        }

        @Override // androidx.core.content.pm.ShortcutInfoCompatSaver
        /* renamed from: addShortcuts, reason: avoid collision after fix types in other method */
        public java.lang.Void addShortcuts2(java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // androidx.core.content.pm.ShortcutInfoCompatSaver
        public /* bridge */ /* synthetic */ java.lang.Void removeAllShortcuts() {
                r1 = this;
                java.lang.Void r0 = r1.removeAllShortcuts2()
                return r0
        }

        @Override // androidx.core.content.pm.ShortcutInfoCompatSaver
        /* renamed from: removeAllShortcuts, reason: avoid collision after fix types in other method */
        public java.lang.Void removeAllShortcuts2() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.core.content.pm.ShortcutInfoCompatSaver
        public /* bridge */ /* synthetic */ java.lang.Void removeShortcuts(java.util.List r1) {
                r0 = this;
                java.lang.Void r1 = r0.removeShortcuts2(r1)
                return r1
        }

        @Override // androidx.core.content.pm.ShortcutInfoCompatSaver
        /* renamed from: removeShortcuts, reason: avoid collision after fix types in other method */
        public java.lang.Void removeShortcuts2(java.util.List<java.lang.String> r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    public ShortcutInfoCompatSaver() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.AnyThread
    public abstract T addShortcuts(java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r1);

    @androidx.annotation.WorkerThread
    public java.util.List<androidx.core.content.pm.ShortcutInfoCompat> getShortcuts() throws java.lang.Exception {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    @androidx.annotation.AnyThread
    public abstract T removeAllShortcuts();

    @androidx.annotation.AnyThread
    public abstract T removeShortcuts(java.util.List<java.lang.String> r1);
}
