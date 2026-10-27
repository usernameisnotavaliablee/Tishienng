package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class SortedLists {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum KeyAbsentBehavior extends java.lang.Enum<com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyAbsentBehavior> {
        private static final /* synthetic */ com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyAbsentBehavior[] $VALUES = null;
        public static final com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyAbsentBehavior INVERTED_INSERTION_INDEX = null;
        public static final com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyAbsentBehavior NEXT_HIGHER = null;
        public static final com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyAbsentBehavior NEXT_LOWER = null;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        enum a extends com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyAbsentBehavior {
            a(java.lang.String r2, int r3) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r2, r3, r0)
                    return
            }

            @Override // com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyAbsentBehavior
            int resultIndex(int r1) {
                    r0 = this;
                    int r1 = r1 + (-1)
                    return r1
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        enum b extends com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyAbsentBehavior {
            b(java.lang.String r2, int r3) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r2, r3, r0)
                    return
            }

            @Override // com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyAbsentBehavior
            public int resultIndex(int r1) {
                    r0 = this;
                    return r1
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        enum c extends com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyAbsentBehavior {
            c(java.lang.String r2, int r3) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r2, r3, r0)
                    return
            }

            @Override // com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyAbsentBehavior
            public int resultIndex(int r1) {
                    r0 = this;
                    int r1 = ~r1
                    return r1
            }
        }

        static {
                com.bumptech.glide.repackaged.com.google.common.collect.SortedLists$KeyAbsentBehavior$a r0 = new com.bumptech.glide.repackaged.com.google.common.collect.SortedLists$KeyAbsentBehavior$a
                java.lang.String r1 = "NEXT_LOWER"
                r2 = 0
                r0.<init>(r1, r2)
                com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_LOWER = r0
                com.bumptech.glide.repackaged.com.google.common.collect.SortedLists$KeyAbsentBehavior$b r1 = new com.bumptech.glide.repackaged.com.google.common.collect.SortedLists$KeyAbsentBehavior$b
                java.lang.String r3 = "NEXT_HIGHER"
                r4 = 1
                r1.<init>(r3, r4)
                com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_HIGHER = r1
                com.bumptech.glide.repackaged.com.google.common.collect.SortedLists$KeyAbsentBehavior$c r3 = new com.bumptech.glide.repackaged.com.google.common.collect.SortedLists$KeyAbsentBehavior$c
                java.lang.String r5 = "INVERTED_INSERTION_INDEX"
                r6 = 2
                r3.<init>(r5, r6)
                com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyAbsentBehavior.INVERTED_INSERTION_INDEX = r3
                r5 = 3
                com.bumptech.glide.repackaged.com.google.common.collect.SortedLists$KeyAbsentBehavior[] r5 = new com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyAbsentBehavior[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyAbsentBehavior.$VALUES = r5
                return
        }

        KeyAbsentBehavior(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ KeyAbsentBehavior(java.lang.String r1, int r2, com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        abstract int resultIndex(int r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum KeyPresentBehavior extends java.lang.Enum<com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior> {
        private static final /* synthetic */ com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior[] $VALUES = null;
        public static final com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior ANY_PRESENT = null;
        public static final com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior FIRST_AFTER = null;
        public static final com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior FIRST_PRESENT = null;
        public static final com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior LAST_BEFORE = null;
        public static final com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior LAST_PRESENT = null;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        enum a extends com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior {
            a(java.lang.String r2, int r3) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r2, r3, r0)
                    return
            }

            @Override // com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior
            <E> int resultIndex(java.util.Comparator<? super E> r1, E r2, java.util.List<? extends E> r3, int r4) {
                    r0 = this;
                    return r4
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        enum b extends com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior {
            b(java.lang.String r2, int r3) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r2, r3, r0)
                    return
            }

            @Override // com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior
            <E> int resultIndex(java.util.Comparator<? super E> r4, E r5, java.util.List<? extends E> r6, int r7) {
                    r3 = this;
                    int r0 = r6.size()
                    int r0 = r0 + (-1)
                L6:
                    if (r7 >= r0) goto L1e
                    int r1 = r7 + r0
                    int r1 = r1 + 1
                    int r1 = r1 >>> 1
                    java.lang.Object r2 = r6.get(r1)
                    int r2 = r4.compare(r2, r5)
                    if (r2 <= 0) goto L1c
                    int r1 = r1 + (-1)
                    r0 = r1
                    goto L6
                L1c:
                    r7 = r1
                    goto L6
                L1e:
                    return r7
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        enum c extends com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior {
            c(java.lang.String r2, int r3) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r2, r3, r0)
                    return
            }

            @Override // com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior
            <E> int resultIndex(java.util.Comparator<? super E> r4, E r5, java.util.List<? extends E> r6, int r7) {
                    r3 = this;
                    r0 = 0
                L1:
                    if (r0 >= r7) goto L17
                    int r1 = r0 + r7
                    int r1 = r1 >>> 1
                    java.lang.Object r2 = r6.get(r1)
                    int r2 = r4.compare(r2, r5)
                    if (r2 >= 0) goto L15
                    int r1 = r1 + 1
                    r0 = r1
                    goto L1
                L15:
                    r7 = r1
                    goto L1
                L17:
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        enum d extends com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior {
            d(java.lang.String r2, int r3) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r2, r3, r0)
                    return
            }

            @Override // com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(java.util.Comparator<? super E> r2, E r3, java.util.List<? extends E> r4, int r5) {
                    r1 = this;
                    com.bumptech.glide.repackaged.com.google.common.collect.SortedLists$KeyPresentBehavior r0 = com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior.LAST_PRESENT
                    int r2 = r0.resultIndex(r2, r3, r4, r5)
                    int r2 = r2 + 1
                    return r2
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        enum e extends com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior {
            e(java.lang.String r2, int r3) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r2, r3, r0)
                    return
            }

            @Override // com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(java.util.Comparator<? super E> r2, E r3, java.util.List<? extends E> r4, int r5) {
                    r1 = this;
                    com.bumptech.glide.repackaged.com.google.common.collect.SortedLists$KeyPresentBehavior r0 = com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior.FIRST_PRESENT
                    int r2 = r0.resultIndex(r2, r3, r4, r5)
                    int r2 = r2 + (-1)
                    return r2
            }
        }

        static {
                com.bumptech.glide.repackaged.com.google.common.collect.SortedLists$KeyPresentBehavior$a r0 = new com.bumptech.glide.repackaged.com.google.common.collect.SortedLists$KeyPresentBehavior$a
                java.lang.String r1 = "ANY_PRESENT"
                r2 = 0
                r0.<init>(r1, r2)
                com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior.ANY_PRESENT = r0
                com.bumptech.glide.repackaged.com.google.common.collect.SortedLists$KeyPresentBehavior$b r1 = new com.bumptech.glide.repackaged.com.google.common.collect.SortedLists$KeyPresentBehavior$b
                java.lang.String r3 = "LAST_PRESENT"
                r4 = 1
                r1.<init>(r3, r4)
                com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior.LAST_PRESENT = r1
                com.bumptech.glide.repackaged.com.google.common.collect.SortedLists$KeyPresentBehavior$c r3 = new com.bumptech.glide.repackaged.com.google.common.collect.SortedLists$KeyPresentBehavior$c
                java.lang.String r5 = "FIRST_PRESENT"
                r6 = 2
                r3.<init>(r5, r6)
                com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior.FIRST_PRESENT = r3
                com.bumptech.glide.repackaged.com.google.common.collect.SortedLists$KeyPresentBehavior$d r5 = new com.bumptech.glide.repackaged.com.google.common.collect.SortedLists$KeyPresentBehavior$d
                java.lang.String r7 = "FIRST_AFTER"
                r8 = 3
                r5.<init>(r7, r8)
                com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior.FIRST_AFTER = r5
                com.bumptech.glide.repackaged.com.google.common.collect.SortedLists$KeyPresentBehavior$e r7 = new com.bumptech.glide.repackaged.com.google.common.collect.SortedLists$KeyPresentBehavior$e
                java.lang.String r9 = "LAST_BEFORE"
                r10 = 4
                r7.<init>(r9, r10)
                com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior.LAST_BEFORE = r7
                r9 = 5
                com.bumptech.glide.repackaged.com.google.common.collect.SortedLists$KeyPresentBehavior[] r9 = new com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior.$VALUES = r9
                return
        }

        KeyPresentBehavior(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ KeyPresentBehavior(java.lang.String r1, int r2, com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        abstract <E> int resultIndex(java.util.Comparator<? super E> r1, E r2, java.util.List<? extends E> r3, int r4);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public SortedLists() {
            r1 = this;
            r1.<init>()
            return
    }

    public static <E> int a(java.util.List<? extends E> r4, E r5, java.util.Comparator<? super E> r6, com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyPresentBehavior r7, com.bumptech.glide.repackaged.com.google.common.collect.SortedLists.KeyAbsentBehavior r8) {
            com.bumptech.glide.repackaged.com.google.common.base.d.i(r6)
            com.bumptech.glide.repackaged.com.google.common.base.d.i(r4)
            com.bumptech.glide.repackaged.com.google.common.base.d.i(r7)
            com.bumptech.glide.repackaged.com.google.common.base.d.i(r8)
            boolean r0 = r4 instanceof java.util.RandomAccess
            if (r0 != 0) goto L14
            java.util.ArrayList r4 = com.bumptech.glide.repackaged.com.google.common.collect.w.g(r4)
        L14:
            int r0 = r4.size()
            int r0 = r0 + (-1)
            r1 = 0
        L1b:
            if (r1 > r0) goto L42
            int r2 = r1 + r0
            int r2 = r2 >>> 1
            java.lang.Object r3 = r4.get(r2)
            int r3 = r6.compare(r5, r3)
            if (r3 >= 0) goto L2f
            int r2 = r2 + (-1)
            r0 = r2
            goto L1b
        L2f:
            if (r3 <= 0) goto L35
            int r2 = r2 + 1
            r1 = r2
            goto L1b
        L35:
            int r0 = r0 + 1
            java.util.List r4 = r4.subList(r1, r0)
            int r2 = r2 - r1
            int r4 = r7.resultIndex(r6, r5, r4, r2)
            int r1 = r1 + r4
            return r1
        L42:
            int r4 = r8.resultIndex(r1)
            return r4
    }
}
