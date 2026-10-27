package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class cq {
    static com.kuaishou.weapon.p0.cq a;
    static com.kuaishou.weapon.p0.cq b;
    static com.kuaishou.weapon.p0.cq c;
    private long d;
    private com.kuaishou.weapon.p0.cq.a e;

    enum a extends java.lang.Enum<com.kuaishou.weapon.p0.cq.a> {
        public static final com.kuaishou.weapon.p0.cq.a a = null;
        public static final com.kuaishou.weapon.p0.cq.a b = null;
        private static final /* synthetic */ com.kuaishou.weapon.p0.cq.a[] d = null;
        int c;

        static {
                com.kuaishou.weapon.p0.cq$a r0 = new com.kuaishou.weapon.p0.cq$a
                r1 = 4
                java.lang.String r2 = "DWORD"
                r3 = 0
                r0.<init>(r2, r3, r1)
                com.kuaishou.weapon.p0.cq.a.a = r0
                com.kuaishou.weapon.p0.cq$a r1 = new com.kuaishou.weapon.p0.cq$a
                r2 = 8
                java.lang.String r4 = "QWORD"
                r5 = 1
                r1.<init>(r4, r5, r2)
                com.kuaishou.weapon.p0.cq.a.b = r1
                r2 = 2
                com.kuaishou.weapon.p0.cq$a[] r2 = new com.kuaishou.weapon.p0.cq.a[r2]
                r2[r3] = r0
                r2[r5] = r1
                com.kuaishou.weapon.p0.cq.a.d = r2
                return
        }

        a(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.c = r3
                return
        }

        public static com.kuaishou.weapon.p0.cq.a valueOf(java.lang.String r1) {
                java.lang.Class<com.kuaishou.weapon.p0.cq$a> r0 = com.kuaishou.weapon.p0.cq.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.kuaishou.weapon.p0.cq$a r1 = (com.kuaishou.weapon.p0.cq.a) r1
                return r1
        }

        public static com.kuaishou.weapon.p0.cq.a[] values() {
                com.kuaishou.weapon.p0.cq$a[] r0 = com.kuaishou.weapon.p0.cq.a.d
                java.lang.Object r0 = r0.clone()
                com.kuaishou.weapon.p0.cq$a[] r0 = (com.kuaishou.weapon.p0.cq.a[]) r0
                return r0
        }
    }

    static {
            c()
            return
    }

    public cq() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void c() {
            com.kuaishou.weapon.p0.cq r0 = new com.kuaishou.weapon.p0.cq
            r0.<init>()
            com.kuaishou.weapon.p0.cq.a = r0
            com.kuaishou.weapon.p0.cq r0 = new com.kuaishou.weapon.p0.cq
            r0.<init>()
            com.kuaishou.weapon.p0.cq.b = r0
            com.kuaishou.weapon.p0.cq r0 = new com.kuaishou.weapon.p0.cq
            r0.<init>()
            com.kuaishou.weapon.p0.cq.c = r0
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.b
            com.kuaishou.weapon.p0.cq$a r1 = com.kuaishou.weapon.p0.cq.a.a
            r0.a(r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            boolean r2 = com.kuaishou.weapon.p0.cr.a()
            java.lang.String r9 = " is not supported now : ("
            java.lang.String r10 = "API LEVEL: "
            r13 = 24
            r3 = 40
            r11 = 4
            r5 = 32
            if (r2 == 0) goto Lca
            com.kuaishou.weapon.p0.cq r1 = com.kuaishou.weapon.p0.cq.a
            com.kuaishou.weapon.p0.cq$a r2 = com.kuaishou.weapon.p0.cq.a.b
            r1.a(r2)
            com.kuaishou.weapon.p0.cq r1 = com.kuaishou.weapon.p0.cq.c
            r1.a(r2)
            r7 = 48
            switch(r0) {
                case 21: goto Lae;
                case 22: goto L98;
                case 23: goto L86;
                case 24: goto L76;
                case 25: goto L76;
                case 26: goto L66;
                case 27: goto L66;
                case 28: goto L56;
                case 29: goto L56;
                default: goto L41;
            }
        L41:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r10)
            r2.append(r0)
            r2.append(r9)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L56:
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.a
            r0.a(r5)
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.c
            r0.a(r13)
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.b
            r0.a(r11)
            return
        L66:
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.a
            r0.a(r3)
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.c
            r0.a(r5)
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.b
            r0.a(r11)
            return
        L76:
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.a
            r0.a(r7)
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.c
            r0.a(r3)
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.b
            r0.a(r11)
            return
        L86:
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.a
            r0.a(r7)
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.c
            r0.a(r3)
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.b
            r1 = 12
            r0.a(r1)
            return
        L98:
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.a
            r1 = 52
            r0.a(r1)
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.c
            r1 = 44
            r0.a(r1)
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.b
            r1 = 20
            r0.a(r1)
            return
        Lae:
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.a
            r0.a(r3)
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.a
            r0.a(r2)
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.c
            r0.a(r5)
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.c
            r0.a(r2)
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.b
            r1 = 56
            r0.a(r1)
            return
        Lca:
            com.kuaishou.weapon.p0.cq r2 = com.kuaishou.weapon.p0.cq.a
            r2.a(r1)
            com.kuaishou.weapon.p0.cq r2 = com.kuaishou.weapon.p0.cq.c
            r2.a(r1)
            r1 = 28
            switch(r0) {
                case 21: goto L148;
                case 22: goto L134;
                case 23: goto L120;
                case 24: goto L110;
                case 25: goto L110;
                case 26: goto L100;
                case 27: goto L100;
                case 28: goto Lee;
                case 29: goto Lee;
                default: goto Ld9;
            }
        Ld9:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r10)
            r2.append(r0)
            r2.append(r9)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        Lee:
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.a
            r0.a(r13)
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.c
            r1 = 20
            r0.a(r1)
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.b
            r0.a(r11)
            return
        L100:
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.a
            r0.a(r1)
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.c
            r0.a(r13)
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.b
            r0.a(r11)
            return
        L110:
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.a
            r0.a(r5)
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.c
            r0.a(r1)
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.b
            r0.a(r11)
            return
        L120:
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.a
            r1 = 36
            r0.a(r1)
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.c
            r0.a(r5)
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.b
            r1 = 12
            r0.a(r1)
            return
        L134:
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.a
            r1 = 44
            r0.a(r1)
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.c
            r0.a(r3)
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.b
            r1 = 20
            r0.a(r1)
            return
        L148:
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.a
            r0.a(r3)
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.a
            com.kuaishou.weapon.p0.cq$a r1 = com.kuaishou.weapon.p0.cq.a.b
            r0.a(r1)
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.c
            r0.a(r5)
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.c
            r0.a(r1)
            com.kuaishou.weapon.p0.cq r0 = com.kuaishou.weapon.p0.cq.b
            r1 = 56
            r0.a(r1)
            return
    }

    public long a() {
            r2 = this;
            long r0 = r2.d
            return r0
    }

    public void a(long r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public void a(com.kuaishou.weapon.p0.cq.a r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public com.kuaishou.weapon.p0.cq.a b() {
            r1 = this;
            com.kuaishou.weapon.p0.cq$a r0 = r1.e
            return r0
    }
}
