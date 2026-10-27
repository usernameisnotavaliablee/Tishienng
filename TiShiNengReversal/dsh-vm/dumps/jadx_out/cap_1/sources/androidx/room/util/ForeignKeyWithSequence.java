package androidx.room.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class ForeignKeyWithSequence implements java.lang.Comparable<androidx.room.util.ForeignKeyWithSequence> {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String from;
    private final int id;
    private final int sequence;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String to;

    public ForeignKeyWithSequence(int r2, int r3, @org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.String r5) {
            r1 = this;
            java.lang.String r0 = "from"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "to"
            kotlin.jvm.internal.g0.p(r5, r0)
            r1.<init>()
            r1.id = r2
            r1.sequence = r3
            r1.from = r4
            r1.to = r5
            return
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(@org.jetbrains.annotations.NotNull androidx.room.util.ForeignKeyWithSequence r3) {
            r2 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r2.id
            int r1 = r3.id
            int r0 = r0 - r1
            if (r0 != 0) goto L11
            int r0 = r2.sequence
            int r3 = r3.sequence
            int r0 = r0 - r3
        L11:
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(androidx.room.util.ForeignKeyWithSequence r1) {
            r0 = this;
            androidx.room.util.ForeignKeyWithSequence r1 = (androidx.room.util.ForeignKeyWithSequence) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFrom() {
            r1 = this;
            java.lang.String r0 = r1.from
            return r0
    }

    public final int getId() {
            r1 = this;
            int r0 = r1.id
            return r0
    }

    public final int getSequence() {
            r1 = this;
            int r0 = r1.sequence
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTo() {
            r1 = this;
            java.lang.String r0 = r1.to
            return r0
    }
}
