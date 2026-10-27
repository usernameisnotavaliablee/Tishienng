package com.github.barteksc.pdfviewer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
class CacheManager {
    private final java.util.PriorityQueue<com.github.barteksc.pdfviewer.model.PagePart> activeCache;
    private final com.github.barteksc.pdfviewer.CacheManager.PagePartComparator orderComparator;
    private final java.lang.Object passiveActiveLock;
    private final java.util.PriorityQueue<com.github.barteksc.pdfviewer.model.PagePart> passiveCache;
    private final java.util.List<com.github.barteksc.pdfviewer.model.PagePart> thumbnails;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class PagePartComparator implements java.util.Comparator<com.github.barteksc.pdfviewer.model.PagePart> {
        final /* synthetic */ com.github.barteksc.pdfviewer.CacheManager this$0;

        PagePartComparator(com.github.barteksc.pdfviewer.CacheManager r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(com.github.barteksc.pdfviewer.model.PagePart r3, com.github.barteksc.pdfviewer.model.PagePart r4) {
                r2 = this;
                int r0 = r3.getCacheOrder()
                int r1 = r4.getCacheOrder()
                if (r0 != r1) goto Lc
                r3 = 0
                return r3
            Lc:
                int r3 = r3.getCacheOrder()
                int r4 = r4.getCacheOrder()
                if (r3 <= r4) goto L18
                r3 = 1
                return r3
            L18:
                r3 = -1
                return r3
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(com.github.barteksc.pdfviewer.model.PagePart r1, com.github.barteksc.pdfviewer.model.PagePart r2) {
                r0 = this;
                com.github.barteksc.pdfviewer.model.PagePart r1 = (com.github.barteksc.pdfviewer.model.PagePart) r1
                com.github.barteksc.pdfviewer.model.PagePart r2 = (com.github.barteksc.pdfviewer.model.PagePart) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }
    }

    public CacheManager() {
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.passiveActiveLock = r0
            com.github.barteksc.pdfviewer.CacheManager$PagePartComparator r0 = new com.github.barteksc.pdfviewer.CacheManager$PagePartComparator
            r0.<init>(r3)
            r3.orderComparator = r0
            java.util.PriorityQueue r1 = new java.util.PriorityQueue
            int r2 = com.github.barteksc.pdfviewer.util.Constants.Cache.CACHE_SIZE
            r1.<init>(r2, r0)
            r3.activeCache = r1
            java.util.PriorityQueue r1 = new java.util.PriorityQueue
            int r2 = com.github.barteksc.pdfviewer.util.Constants.Cache.CACHE_SIZE
            r1.<init>(r2, r0)
            r3.passiveCache = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.thumbnails = r0
            return
    }

    private void addWithoutDuplicates(java.util.Collection<com.github.barteksc.pdfviewer.model.PagePart> r3, com.github.barteksc.pdfviewer.model.PagePart r4) {
            r2 = this;
            java.util.Iterator r0 = r3.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            com.github.barteksc.pdfviewer.model.PagePart r1 = (com.github.barteksc.pdfviewer.model.PagePart) r1
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L4
            android.graphics.Bitmap r3 = r4.getRenderedBitmap()
            r3.recycle()
            return
        L1e:
            r3.add(r4)
            return
    }

    @androidx.annotation.Nullable
    private static com.github.barteksc.pdfviewer.model.PagePart find(java.util.PriorityQueue<com.github.barteksc.pdfviewer.model.PagePart> r2, com.github.barteksc.pdfviewer.model.PagePart r3) {
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L17
            java.lang.Object r0 = r2.next()
            com.github.barteksc.pdfviewer.model.PagePart r0 = (com.github.barteksc.pdfviewer.model.PagePart) r0
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L4
            return r0
        L17:
            r2 = 0
            return r2
    }

    private void makeAFreeSpace() {
            r3 = this;
            java.lang.Object r0 = r3.passiveActiveLock
            monitor-enter(r0)
        L3:
            java.util.PriorityQueue<com.github.barteksc.pdfviewer.model.PagePart> r1 = r3.activeCache     // Catch: java.lang.Throwable -> L2c
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L2c
            java.util.PriorityQueue<com.github.barteksc.pdfviewer.model.PagePart> r2 = r3.passiveCache     // Catch: java.lang.Throwable -> L2c
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L2c
            int r1 = r1 + r2
            int r2 = com.github.barteksc.pdfviewer.util.Constants.Cache.CACHE_SIZE     // Catch: java.lang.Throwable -> L2c
            if (r1 < r2) goto L2e
            java.util.PriorityQueue<com.github.barteksc.pdfviewer.model.PagePart> r1 = r3.passiveCache     // Catch: java.lang.Throwable -> L2c
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2c
            if (r1 != 0) goto L2e
            java.util.PriorityQueue<com.github.barteksc.pdfviewer.model.PagePart> r1 = r3.passiveCache     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> L2c
            com.github.barteksc.pdfviewer.model.PagePart r1 = (com.github.barteksc.pdfviewer.model.PagePart) r1     // Catch: java.lang.Throwable -> L2c
            android.graphics.Bitmap r1 = r1.getRenderedBitmap()     // Catch: java.lang.Throwable -> L2c
            r1.recycle()     // Catch: java.lang.Throwable -> L2c
            goto L3
        L2c:
            r1 = move-exception
            goto L59
        L2e:
            java.util.PriorityQueue<com.github.barteksc.pdfviewer.model.PagePart> r1 = r3.activeCache     // Catch: java.lang.Throwable -> L2c
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L2c
            java.util.PriorityQueue<com.github.barteksc.pdfviewer.model.PagePart> r2 = r3.passiveCache     // Catch: java.lang.Throwable -> L2c
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L2c
            int r1 = r1 + r2
            int r2 = com.github.barteksc.pdfviewer.util.Constants.Cache.CACHE_SIZE     // Catch: java.lang.Throwable -> L2c
            if (r1 < r2) goto L57
            java.util.PriorityQueue<com.github.barteksc.pdfviewer.model.PagePart> r1 = r3.activeCache     // Catch: java.lang.Throwable -> L2c
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2c
            if (r1 != 0) goto L57
            java.util.PriorityQueue<com.github.barteksc.pdfviewer.model.PagePart> r1 = r3.activeCache     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> L2c
            com.github.barteksc.pdfviewer.model.PagePart r1 = (com.github.barteksc.pdfviewer.model.PagePart) r1     // Catch: java.lang.Throwable -> L2c
            android.graphics.Bitmap r1 = r1.getRenderedBitmap()     // Catch: java.lang.Throwable -> L2c
            r1.recycle()     // Catch: java.lang.Throwable -> L2c
            goto L2e
        L57:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            return
        L59:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r1
    }

    public void cachePart(com.github.barteksc.pdfviewer.model.PagePart r3) {
            r2 = this;
            java.lang.Object r0 = r2.passiveActiveLock
            monitor-enter(r0)
            r2.makeAFreeSpace()     // Catch: java.lang.Throwable -> Ld
            java.util.PriorityQueue<com.github.barteksc.pdfviewer.model.PagePart> r1 = r2.activeCache     // Catch: java.lang.Throwable -> Ld
            r1.offer(r3)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }

    public void cacheThumbnail(com.github.barteksc.pdfviewer.model.PagePart r4) {
            r3 = this;
            java.util.List<com.github.barteksc.pdfviewer.model.PagePart> r0 = r3.thumbnails
            monitor-enter(r0)
        L3:
            java.util.List<com.github.barteksc.pdfviewer.model.PagePart> r1 = r3.thumbnails     // Catch: java.lang.Throwable -> L1e
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L1e
            int r2 = com.github.barteksc.pdfviewer.util.Constants.Cache.THUMBNAILS_CACHE_SIZE     // Catch: java.lang.Throwable -> L1e
            if (r1 < r2) goto L20
            java.util.List<com.github.barteksc.pdfviewer.model.PagePart> r1 = r3.thumbnails     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            java.lang.Object r1 = r1.remove(r2)     // Catch: java.lang.Throwable -> L1e
            com.github.barteksc.pdfviewer.model.PagePart r1 = (com.github.barteksc.pdfviewer.model.PagePart) r1     // Catch: java.lang.Throwable -> L1e
            android.graphics.Bitmap r1 = r1.getRenderedBitmap()     // Catch: java.lang.Throwable -> L1e
            r1.recycle()     // Catch: java.lang.Throwable -> L1e
            goto L3
        L1e:
            r4 = move-exception
            goto L27
        L20:
            java.util.List<com.github.barteksc.pdfviewer.model.PagePart> r1 = r3.thumbnails     // Catch: java.lang.Throwable -> L1e
            r3.addWithoutDuplicates(r1, r4)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r4
    }

    public boolean containsThumbnail(int r7, android.graphics.RectF r8) {
            r6 = this;
            com.github.barteksc.pdfviewer.model.PagePart r0 = new com.github.barteksc.pdfviewer.model.PagePart
            r4 = 1
            r5 = 0
            r2 = 0
            r1 = r7
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.List<com.github.barteksc.pdfviewer.model.PagePart> r7 = r6.thumbnails
            monitor-enter(r7)
            java.util.List<com.github.barteksc.pdfviewer.model.PagePart> r8 = r6.thumbnails     // Catch: java.lang.Throwable -> L28
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L28
        L13:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> L28
            com.github.barteksc.pdfviewer.model.PagePart r1 = (com.github.barteksc.pdfviewer.model.PagePart) r1     // Catch: java.lang.Throwable -> L28
            boolean r1 = r1.equals(r0)     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L13
            r8 = 1
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L28
            return r8
        L28:
            r0 = move-exception
            r8 = r0
            goto L2e
        L2b:
            r8 = 0
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L28
            return r8
        L2e:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L28
            throw r8
    }

    public java.util.List<com.github.barteksc.pdfviewer.model.PagePart> getPageParts() {
            r3 = this;
            java.lang.Object r0 = r3.passiveActiveLock
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L11
            java.util.PriorityQueue<com.github.barteksc.pdfviewer.model.PagePart> r2 = r3.passiveCache     // Catch: java.lang.Throwable -> L11
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
            java.util.PriorityQueue<com.github.barteksc.pdfviewer.model.PagePart> r2 = r3.activeCache     // Catch: java.lang.Throwable -> L11
            r1.addAll(r2)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    public java.util.List<com.github.barteksc.pdfviewer.model.PagePart> getThumbnails() {
            r2 = this;
            java.util.List<com.github.barteksc.pdfviewer.model.PagePart> r0 = r2.thumbnails
            monitor-enter(r0)
            java.util.List<com.github.barteksc.pdfviewer.model.PagePart> r1 = r2.thumbnails     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public void makeANewSet() {
            r3 = this;
            java.lang.Object r0 = r3.passiveActiveLock
            monitor-enter(r0)
            java.util.PriorityQueue<com.github.barteksc.pdfviewer.model.PagePart> r1 = r3.passiveCache     // Catch: java.lang.Throwable -> L11
            java.util.PriorityQueue<com.github.barteksc.pdfviewer.model.PagePart> r2 = r3.activeCache     // Catch: java.lang.Throwable -> L11
            r1.addAll(r2)     // Catch: java.lang.Throwable -> L11
            java.util.PriorityQueue<com.github.barteksc.pdfviewer.model.PagePart> r1 = r3.activeCache     // Catch: java.lang.Throwable -> L11
            r1.clear()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    public void recycle() {
            r3 = this;
            java.lang.Object r0 = r3.passiveActiveLock
            monitor-enter(r0)
            java.util.PriorityQueue<com.github.barteksc.pdfviewer.model.PagePart> r1 = r3.passiveCache     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1d
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1d
            com.github.barteksc.pdfviewer.model.PagePart r2 = (com.github.barteksc.pdfviewer.model.PagePart) r2     // Catch: java.lang.Throwable -> L1d
            android.graphics.Bitmap r2 = r2.getRenderedBitmap()     // Catch: java.lang.Throwable -> L1d
            r2.recycle()     // Catch: java.lang.Throwable -> L1d
            goto L9
        L1d:
            r1 = move-exception
            goto L6c
        L1f:
            java.util.PriorityQueue<com.github.barteksc.pdfviewer.model.PagePart> r1 = r3.passiveCache     // Catch: java.lang.Throwable -> L1d
            r1.clear()     // Catch: java.lang.Throwable -> L1d
            java.util.PriorityQueue<com.github.barteksc.pdfviewer.model.PagePart> r1 = r3.activeCache     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1d
        L2a:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1d
            com.github.barteksc.pdfviewer.model.PagePart r2 = (com.github.barteksc.pdfviewer.model.PagePart) r2     // Catch: java.lang.Throwable -> L1d
            android.graphics.Bitmap r2 = r2.getRenderedBitmap()     // Catch: java.lang.Throwable -> L1d
            r2.recycle()     // Catch: java.lang.Throwable -> L1d
            goto L2a
        L3e:
            java.util.PriorityQueue<com.github.barteksc.pdfviewer.model.PagePart> r1 = r3.activeCache     // Catch: java.lang.Throwable -> L1d
            r1.clear()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            java.util.List<com.github.barteksc.pdfviewer.model.PagePart> r1 = r3.thumbnails
            monitor-enter(r1)
            java.util.List<com.github.barteksc.pdfviewer.model.PagePart> r0 = r3.thumbnails     // Catch: java.lang.Throwable -> L61
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L61
        L4d:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L61
            if (r2 == 0) goto L63
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L61
            com.github.barteksc.pdfviewer.model.PagePart r2 = (com.github.barteksc.pdfviewer.model.PagePart) r2     // Catch: java.lang.Throwable -> L61
            android.graphics.Bitmap r2 = r2.getRenderedBitmap()     // Catch: java.lang.Throwable -> L61
            r2.recycle()     // Catch: java.lang.Throwable -> L61
            goto L4d
        L61:
            r0 = move-exception
            goto L6a
        L63:
            java.util.List<com.github.barteksc.pdfviewer.model.PagePart> r0 = r3.thumbnails     // Catch: java.lang.Throwable -> L61
            r0.clear()     // Catch: java.lang.Throwable -> L61
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L61
            return
        L6a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L61
            throw r0
        L6c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r1
    }

    public boolean upPartIfContained(int r7, android.graphics.RectF r8, int r9) {
            r6 = this;
            com.github.barteksc.pdfviewer.model.PagePart r0 = new com.github.barteksc.pdfviewer.model.PagePart
            r4 = 0
            r5 = 0
            r2 = 0
            r1 = r7
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Object r7 = r6.passiveActiveLock
            monitor-enter(r7)
            java.util.PriorityQueue<com.github.barteksc.pdfviewer.model.PagePart> r8 = r6.passiveCache     // Catch: java.lang.Throwable -> L25
            com.github.barteksc.pdfviewer.model.PagePart r8 = find(r8, r0)     // Catch: java.lang.Throwable -> L25
            r1 = 1
            if (r8 == 0) goto L28
            java.util.PriorityQueue<com.github.barteksc.pdfviewer.model.PagePart> r0 = r6.passiveCache     // Catch: java.lang.Throwable -> L25
            r0.remove(r8)     // Catch: java.lang.Throwable -> L25
            r8.setCacheOrder(r9)     // Catch: java.lang.Throwable -> L25
            java.util.PriorityQueue<com.github.barteksc.pdfviewer.model.PagePart> r9 = r6.activeCache     // Catch: java.lang.Throwable -> L25
            r9.offer(r8)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L25
            return r1
        L25:
            r0 = move-exception
            r8 = r0
            goto L34
        L28:
            java.util.PriorityQueue<com.github.barteksc.pdfviewer.model.PagePart> r8 = r6.activeCache     // Catch: java.lang.Throwable -> L25
            com.github.barteksc.pdfviewer.model.PagePart r8 = find(r8, r0)     // Catch: java.lang.Throwable -> L25
            if (r8 == 0) goto L31
            goto L32
        L31:
            r1 = 0
        L32:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L25
            return r1
        L34:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L25
            throw r8
    }
}
