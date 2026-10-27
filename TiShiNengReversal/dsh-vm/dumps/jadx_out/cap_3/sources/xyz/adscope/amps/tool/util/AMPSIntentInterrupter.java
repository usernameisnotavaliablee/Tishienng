package xyz.adscope.amps.tool.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class AMPSIntentInterrupter {
    private xyz.adscope.amps.tool.util.AMPSIntentInterrupter.PrefixTrie trie;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.amps.tool.util.AMPSIntentInterrupter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class InterruptHolder {
        private static final xyz.adscope.amps.tool.util.AMPSIntentInterrupter INSTANCE = null;

        static {
                xyz.adscope.amps.tool.util.AMPSIntentInterrupter r0 = new xyz.adscope.amps.tool.util.AMPSIntentInterrupter
                r1 = 0
                r0.<init>(r1)
                xyz.adscope.amps.tool.util.AMPSIntentInterrupter.InterruptHolder.INSTANCE = r0
                return
        }

        private InterruptHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ xyz.adscope.amps.tool.util.AMPSIntentInterrupter access$100() {
                xyz.adscope.amps.tool.util.AMPSIntentInterrupter r0 = xyz.adscope.amps.tool.util.AMPSIntentInterrupter.InterruptHolder.INSTANCE
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class PrefixTrie {
        private xyz.adscope.amps.tool.util.AMPSIntentInterrupter.TrieNode root;

        private PrefixTrie() {
                r2 = this;
                r2.<init>()
                xyz.adscope.amps.tool.util.AMPSIntentInterrupter$TrieNode r0 = new xyz.adscope.amps.tool.util.AMPSIntentInterrupter$TrieNode
                r1 = 0
                r0.<init>(r1)
                r2.root = r0
                return
        }

        /* synthetic */ PrefixTrie(xyz.adscope.amps.tool.util.AMPSIntentInterrupter.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ void access$300(xyz.adscope.amps.tool.util.AMPSIntentInterrupter.PrefixTrie r0, java.lang.String r1) {
                r0.insert(r1)
                return
        }

        static /* synthetic */ boolean access$400(xyz.adscope.amps.tool.util.AMPSIntentInterrupter.PrefixTrie r0, java.lang.String r1) {
                boolean r0 = r0.startsWithAny(r1)
                return r0
        }

        private void insert(java.lang.String r7) {
                r6 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r7)
                if (r0 != 0) goto L36
                xyz.adscope.amps.tool.util.AMPSIntentInterrupter$TrieNode r0 = r6.root
                char[] r7 = r7.toCharArray()
                int r1 = r7.length
                r2 = 0
            Le:
                if (r2 >= r1) goto L33
                char r3 = r7[r2]
                java.util.Map<java.lang.Character, xyz.adscope.amps.tool.util.AMPSIntentInterrupter$TrieNode> r4 = r0.children
                java.lang.Character r5 = java.lang.Character.valueOf(r3)
                java.lang.Object r4 = r4.get(r5)
                xyz.adscope.amps.tool.util.AMPSIntentInterrupter$TrieNode r4 = (xyz.adscope.amps.tool.util.AMPSIntentInterrupter.TrieNode) r4
                if (r4 != 0) goto L2f
                xyz.adscope.amps.tool.util.AMPSIntentInterrupter$TrieNode r4 = new xyz.adscope.amps.tool.util.AMPSIntentInterrupter$TrieNode
                r5 = 0
                r4.<init>(r5)
                java.util.Map<java.lang.Character, xyz.adscope.amps.tool.util.AMPSIntentInterrupter$TrieNode> r0 = r0.children
                java.lang.Character r3 = java.lang.Character.valueOf(r3)
                r0.put(r3, r4)
            L2f:
                r0 = r4
                int r2 = r2 + 1
                goto Le
            L33:
                r7 = 1
                r0.isEndOfWord = r7
            L36:
                return
        }

        private boolean startsWithAny(java.lang.String r6) {
                r5 = this;
                xyz.adscope.amps.tool.util.AMPSIntentInterrupter$TrieNode r0 = r5.root
                char[] r6 = r6.toCharArray()
                int r1 = r6.length
                r2 = 0
                r3 = 0
            L9:
                if (r3 >= r1) goto L25
                char r4 = r6[r3]
                java.util.Map<java.lang.Character, xyz.adscope.amps.tool.util.AMPSIntentInterrupter$TrieNode> r0 = r0.children
                java.lang.Character r4 = java.lang.Character.valueOf(r4)
                java.lang.Object r0 = r0.get(r4)
                xyz.adscope.amps.tool.util.AMPSIntentInterrupter$TrieNode r0 = (xyz.adscope.amps.tool.util.AMPSIntentInterrupter.TrieNode) r0
                if (r0 != 0) goto L1c
                return r2
            L1c:
                boolean r4 = r0.isEndOfWord
                if (r4 == 0) goto L22
                r6 = 1
                return r6
            L22:
                int r3 = r3 + 1
                goto L9
            L25:
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class TrieNode {
        java.util.Map<java.lang.Character, xyz.adscope.amps.tool.util.AMPSIntentInterrupter.TrieNode> children;
        boolean isEndOfWord;

        private TrieNode() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.children = r0
                r0 = 0
                r1.isEndOfWord = r0
                return
        }

        /* synthetic */ TrieNode(xyz.adscope.amps.tool.util.AMPSIntentInterrupter.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private AMPSIntentInterrupter() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ AMPSIntentInterrupter(xyz.adscope.amps.tool.util.AMPSIntentInterrupter.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static xyz.adscope.amps.tool.util.AMPSIntentInterrupter getInstance() {
            xyz.adscope.amps.tool.util.AMPSIntentInterrupter r0 = xyz.adscope.amps.tool.util.AMPSIntentInterrupter.InterruptHolder.access$100()
            return r0
    }

    private boolean interruptBlackList(android.content.Intent r3) {
            r2 = this;
            java.lang.String r0 = "android.intent.action.VIEW"
            java.lang.String r1 = r3.getAction()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            android.net.Uri r3 = r3.getData()
            if (r3 == 0) goto L25
            java.lang.String r0 = r3.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L25
            java.lang.String r3 = r3.toString()
            boolean r3 = r2.interruptData(r3)
            return r3
        L25:
            r3 = 0
            return r3
    }

    private boolean interruptByComponentName(android.content.Context r1, android.content.Intent r2) {
            r0 = this;
            android.content.ComponentName r2 = r2.getComponent()
            if (r2 == 0) goto Ld
            boolean r1 = r0.isAppInternalIntent(r1, r2)
            r1 = r1 ^ 1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    private boolean interruptData(java.lang.String r2) {
            r1 = this;
            xyz.adscope.amps.tool.util.AMPSIntentInterrupter$PrefixTrie r0 = r1.trie
            if (r0 == 0) goto L9
            boolean r2 = xyz.adscope.amps.tool.util.AMPSIntentInterrupter.PrefixTrie.access$400(r0, r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    private boolean isAppInternalIntent(android.content.Context r1, android.content.ComponentName r2) {
            r0 = this;
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r1 = r1.getPackageName()
            boolean r1 = r2.equals(r1)
            return r1
    }

    public void initInterrupter(java.util.List<java.lang.String> r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L27
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L27
            xyz.adscope.amps.tool.util.AMPSIntentInterrupter$PrefixTrie r1 = new xyz.adscope.amps.tool.util.AMPSIntentInterrupter$PrefixTrie
            r1.<init>(r0)
            r2.trie = r1
            java.util.Iterator r3 = r3.iterator()
        L14:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            xyz.adscope.amps.tool.util.AMPSIntentInterrupter$PrefixTrie r1 = r2.trie
            xyz.adscope.amps.tool.util.AMPSIntentInterrupter.PrefixTrie.access$300(r1, r0)
            goto L14
        L26:
            return
        L27:
            r2.trie = r0
            return
    }

    public boolean interruptRpkDeeplink(android.content.Context r2, android.content.Intent r3) {
            r1 = this;
            r0 = 0
            if (r2 == 0) goto L13
            if (r3 != 0) goto L6
            goto L13
        L6:
            boolean r2 = r1.interruptByComponentName(r2, r3)     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto Le
            r2 = 1
            return r2
        Le:
            boolean r2 = r1.interruptBlackList(r3)     // Catch: java.lang.Throwable -> L13
            return r2
        L13:
            return r0
    }
}
