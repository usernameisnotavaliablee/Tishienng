package xyz.adscope.common.network.cookie.db;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class Where {
    private java.lang.StringBuilder a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.network.cookie.db.Where$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder {
        private java.lang.StringBuilder a;

        private Builder() {
                r1 = this;
                r1.<init>()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1.a = r0
                return
        }

        /* synthetic */ Builder(xyz.adscope.common.network.cookie.db.Where.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ java.lang.StringBuilder a(xyz.adscope.common.network.cookie.db.Where.Builder r0) {
                java.lang.StringBuilder r0 = r0.a
                return r0
        }

        private xyz.adscope.common.network.cookie.db.Where.Builder a(java.lang.CharSequence r3, xyz.adscope.common.network.cookie.db.Where.Options r4) {
                r2 = this;
                java.lang.StringBuilder r0 = r2.a
                java.lang.String r1 = "\""
                r0.append(r1)
                r0.append(r3)
                r0.append(r1)
                java.lang.String r3 = xyz.adscope.common.network.cookie.db.Where.Options.a(r4)
                r0.append(r3)
                return r2
        }

        public xyz.adscope.common.network.cookie.db.Where.Builder add(java.lang.CharSequence r1, xyz.adscope.common.network.cookie.db.Where.Options r2, java.lang.Object r3) {
                r0 = this;
                xyz.adscope.common.network.cookie.db.Where$Builder r1 = r0.a(r1, r2)
                java.lang.String r2 = "'"
                xyz.adscope.common.network.cookie.db.Where$Builder r1 = r1.append(r2)
                xyz.adscope.common.network.cookie.db.Where$Builder r1 = r1.append(r3)
                r1.append(r2)
                return r0
        }

        public xyz.adscope.common.network.cookie.db.Where.Builder and() {
                r2 = this;
                java.lang.StringBuilder r0 = r2.a
                int r0 = r0.length()
                if (r0 <= 0) goto Lf
                java.lang.StringBuilder r0 = r2.a
                java.lang.String r1 = " AND "
                r0.append(r1)
            Lf:
                return r2
        }

        public xyz.adscope.common.network.cookie.db.Where.Builder and(java.lang.CharSequence r2, xyz.adscope.common.network.cookie.db.Where.Options r3, java.lang.Object r4) {
                r1 = this;
                xyz.adscope.common.network.cookie.db.Where$Builder r0 = r1.and()
                xyz.adscope.common.network.cookie.db.Where$Builder r2 = r0.add(r2, r3, r4)
                return r2
        }

        public xyz.adscope.common.network.cookie.db.Where.Builder and(xyz.adscope.common.network.cookie.db.Where r2) {
                r1 = this;
                xyz.adscope.common.network.cookie.db.Where$Builder r0 = r1.and()
                xyz.adscope.common.network.cookie.db.Where$Builder r2 = r0.append(r2)
                return r2
        }

        public xyz.adscope.common.network.cookie.db.Where.Builder andNull(java.lang.CharSequence r2) {
                r1 = this;
                xyz.adscope.common.network.cookie.db.Where$Builder r0 = r1.and()
                xyz.adscope.common.network.cookie.db.Where$Builder r2 = r0.isNull(r2)
                return r2
        }

        public xyz.adscope.common.network.cookie.db.Where.Builder append(java.lang.Object r2) {
                r1 = this;
                java.lang.StringBuilder r0 = r1.a
                r0.append(r2)
                return r1
        }

        public xyz.adscope.common.network.cookie.db.Where.Builder bracket() {
                r2 = this;
                r0 = 0
                java.lang.String r1 = "("
                xyz.adscope.common.network.cookie.db.Where$Builder r0 = r2.insert(r0, r1)
                r1 = 41
                java.lang.Character r1 = java.lang.Character.valueOf(r1)
                xyz.adscope.common.network.cookie.db.Where$Builder r0 = r0.append(r1)
                return r0
        }

        public xyz.adscope.common.network.cookie.db.Where build() {
                r2 = this;
                xyz.adscope.common.network.cookie.db.Where r0 = new xyz.adscope.common.network.cookie.db.Where
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public <T> xyz.adscope.common.network.cookie.db.Where.Builder in(java.lang.CharSequence r3, java.util.List<T> r4) {
                r2 = this;
                java.lang.StringBuilder r0 = r2.a
                r0.append(r3)
                java.lang.String r3 = " IN "
                r0.append(r3)
                java.lang.String r3 = "("
                r0.append(r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.util.Iterator r4 = r4.iterator()
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L43
                java.lang.String r0 = "'"
                r3.append(r0)
                java.lang.Object r1 = r4.next()
                r3.append(r1)
                r3.append(r0)
            L2d:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L43
                java.lang.String r1 = ", '"
                r3.append(r1)
                java.lang.Object r1 = r4.next()
                r3.append(r1)
                r3.append(r0)
                goto L2d
            L43:
                java.lang.StringBuilder r4 = r2.a
                r4.append(r3)
                java.lang.String r3 = ")"
                r4.append(r3)
                return r2
        }

        public xyz.adscope.common.network.cookie.db.Where.Builder insert(int r2, java.lang.CharSequence r3) {
                r1 = this;
                java.lang.StringBuilder r0 = r1.a
                r0.insert(r2, r3)
                return r1
        }

        public xyz.adscope.common.network.cookie.db.Where.Builder isNull(java.lang.CharSequence r3) {
                r2 = this;
                java.lang.StringBuilder r0 = r2.a
                java.lang.String r1 = "\""
                r0.append(r1)
                r0.append(r3)
                r0.append(r1)
                java.lang.String r3 = " IS "
                r0.append(r3)
                java.lang.String r3 = "NULL"
                r0.append(r3)
                return r2
        }

        public xyz.adscope.common.network.cookie.db.Where.Builder or() {
                r2 = this;
                java.lang.StringBuilder r0 = r2.a
                int r0 = r0.length()
                if (r0 <= 0) goto Lf
                java.lang.StringBuilder r0 = r2.a
                java.lang.String r1 = " OR "
                r0.append(r1)
            Lf:
                return r2
        }

        public xyz.adscope.common.network.cookie.db.Where.Builder or(java.lang.CharSequence r2, xyz.adscope.common.network.cookie.db.Where.Options r3, java.lang.Object r4) {
                r1 = this;
                xyz.adscope.common.network.cookie.db.Where$Builder r0 = r1.or()
                xyz.adscope.common.network.cookie.db.Where$Builder r2 = r0.add(r2, r3, r4)
                return r2
        }

        public xyz.adscope.common.network.cookie.db.Where.Builder or(xyz.adscope.common.network.cookie.db.Where r2) {
                r1 = this;
                xyz.adscope.common.network.cookie.db.Where$Builder r0 = r1.or()
                xyz.adscope.common.network.cookie.db.Where$Builder r2 = r0.append(r2)
                return r2
        }

        public xyz.adscope.common.network.cookie.db.Where.Builder orNull(java.lang.CharSequence r2) {
                r1 = this;
                xyz.adscope.common.network.cookie.db.Where$Builder r0 = r1.or()
                xyz.adscope.common.network.cookie.db.Where$Builder r2 = r0.isNull(r2)
                return r2
        }

        public xyz.adscope.common.network.cookie.db.Where.Builder set(java.lang.String r4) {
                r3 = this;
                java.lang.StringBuilder r0 = r3.a
                int r1 = r0.length()
                r2 = 0
                java.lang.StringBuilder r0 = r0.delete(r2, r1)
                r0.append(r4)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Options extends java.lang.Enum<xyz.adscope.common.network.cookie.db.Where.Options> {
        public static final xyz.adscope.common.network.cookie.db.Where.Options BIGGER = null;
        public static final xyz.adscope.common.network.cookie.db.Where.Options EQUAL = null;
        public static final xyz.adscope.common.network.cookie.db.Where.Options NO_EQUAL = null;
        public static final xyz.adscope.common.network.cookie.db.Where.Options SMALLER = null;
        private static final /* synthetic */ xyz.adscope.common.network.cookie.db.Where.Options[] b = null;
        private java.lang.String a;

        static {
                xyz.adscope.common.network.cookie.db.Where$Options r0 = new xyz.adscope.common.network.cookie.db.Where$Options
                r1 = 0
                java.lang.String r2 = " = "
                java.lang.String r3 = "EQUAL"
                r0.<init>(r3, r1, r2)
                xyz.adscope.common.network.cookie.db.Where.Options.EQUAL = r0
                xyz.adscope.common.network.cookie.db.Where$Options r0 = new xyz.adscope.common.network.cookie.db.Where$Options
                r1 = 1
                java.lang.String r2 = " != "
                java.lang.String r3 = "NO_EQUAL"
                r0.<init>(r3, r1, r2)
                xyz.adscope.common.network.cookie.db.Where.Options.NO_EQUAL = r0
                xyz.adscope.common.network.cookie.db.Where$Options r0 = new xyz.adscope.common.network.cookie.db.Where$Options
                r1 = 2
                java.lang.String r2 = " > "
                java.lang.String r3 = "BIGGER"
                r0.<init>(r3, r1, r2)
                xyz.adscope.common.network.cookie.db.Where.Options.BIGGER = r0
                xyz.adscope.common.network.cookie.db.Where$Options r0 = new xyz.adscope.common.network.cookie.db.Where$Options
                r1 = 3
                java.lang.String r2 = " < "
                java.lang.String r3 = "SMALLER"
                r0.<init>(r3, r1, r2)
                xyz.adscope.common.network.cookie.db.Where.Options.SMALLER = r0
                xyz.adscope.common.network.cookie.db.Where$Options[] r0 = a()
                xyz.adscope.common.network.cookie.db.Where.Options.b = r0
                return
        }

        Options(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.a = r3
                return
        }

        static /* synthetic */ java.lang.String a(xyz.adscope.common.network.cookie.db.Where.Options r0) {
                java.lang.String r0 = r0.a
                return r0
        }

        private static /* synthetic */ xyz.adscope.common.network.cookie.db.Where.Options[] a() {
                r0 = 4
                xyz.adscope.common.network.cookie.db.Where$Options[] r0 = new xyz.adscope.common.network.cookie.db.Where.Options[r0]
                xyz.adscope.common.network.cookie.db.Where$Options r1 = xyz.adscope.common.network.cookie.db.Where.Options.EQUAL
                r2 = 0
                r0[r2] = r1
                xyz.adscope.common.network.cookie.db.Where$Options r1 = xyz.adscope.common.network.cookie.db.Where.Options.NO_EQUAL
                r2 = 1
                r0[r2] = r1
                xyz.adscope.common.network.cookie.db.Where$Options r1 = xyz.adscope.common.network.cookie.db.Where.Options.BIGGER
                r2 = 2
                r0[r2] = r1
                xyz.adscope.common.network.cookie.db.Where$Options r1 = xyz.adscope.common.network.cookie.db.Where.Options.SMALLER
                r2 = 3
                r0[r2] = r1
                return r0
        }

        public static xyz.adscope.common.network.cookie.db.Where.Options valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.common.network.cookie.db.Where$Options> r0 = xyz.adscope.common.network.cookie.db.Where.Options.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.common.network.cookie.db.Where$Options r1 = (xyz.adscope.common.network.cookie.db.Where.Options) r1
                return r1
        }

        public static xyz.adscope.common.network.cookie.db.Where.Options[] values() {
                xyz.adscope.common.network.cookie.db.Where$Options[] r0 = xyz.adscope.common.network.cookie.db.Where.Options.b
                java.lang.Object r0 = r0.clone()
                xyz.adscope.common.network.cookie.db.Where$Options[] r0 = (xyz.adscope.common.network.cookie.db.Where.Options[]) r0
                return r0
        }
    }

    private Where(xyz.adscope.common.network.cookie.db.Where.Builder r1) {
            r0 = this;
            r0.<init>()
            java.lang.StringBuilder r1 = xyz.adscope.common.network.cookie.db.Where.Builder.a(r1)
            r0.a = r1
            return
    }

    /* synthetic */ Where(xyz.adscope.common.network.cookie.db.Where.Builder r1, xyz.adscope.common.network.cookie.db.Where.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static xyz.adscope.common.network.cookie.db.Where.Builder newBuilder() {
            xyz.adscope.common.network.cookie.db.Where$Builder r0 = new xyz.adscope.common.network.cookie.db.Where$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.StringBuilder r0 = r1.a
            java.lang.String r0 = r0.toString()
            return r0
    }
}
