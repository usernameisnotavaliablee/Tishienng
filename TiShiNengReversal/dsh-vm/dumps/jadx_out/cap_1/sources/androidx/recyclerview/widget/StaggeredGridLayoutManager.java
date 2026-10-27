package androidx.recyclerview.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class StaggeredGridLayoutManager extends androidx.recyclerview.widget.RecyclerView.LayoutManager implements androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider {
    static final boolean DEBUG = false;

    @java.lang.Deprecated
    public static final int GAP_HANDLING_LAZY = 1;
    public static final int GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS = 2;
    public static final int GAP_HANDLING_NONE = 0;
    public static final int HORIZONTAL = 0;
    static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final java.lang.String TAG = "StaggeredGridLManager";
    public static final int VERTICAL = 1;
    private final androidx.recyclerview.widget.StaggeredGridLayoutManager.AnchorInfo mAnchorInfo;
    private final java.lang.Runnable mCheckForGapsRunnable;
    private int mFullSizeSpec;
    private int mGapStrategy;
    private boolean mLaidOutInvalidFullSpan;
    private boolean mLastLayoutFromEnd;
    private boolean mLastLayoutRTL;

    @androidx.annotation.NonNull
    private final androidx.recyclerview.widget.LayoutState mLayoutState;
    androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup mLazySpanLookup;
    private int mOrientation;
    private androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private int[] mPrefetchDistances;

    @androidx.annotation.NonNull
    androidx.recyclerview.widget.OrientationHelper mPrimaryOrientation;
    private java.util.BitSet mRemainingSpans;
    boolean mReverseLayout;

    @androidx.annotation.NonNull
    androidx.recyclerview.widget.OrientationHelper mSecondaryOrientation;
    boolean mShouldReverseLayout;
    private int mSizePerSpan;
    private boolean mSmoothScrollbarEnabled;
    private int mSpanCount;
    androidx.recyclerview.widget.StaggeredGridLayoutManager.Span[] mSpans;
    private final android.graphics.Rect mTmpRect;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class AnchorInfo {
        boolean mInvalidateOffsets;
        boolean mLayoutFromEnd;
        int mOffset;
        int mPosition;
        int[] mSpanReferenceLines;
        boolean mValid;
        final /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager this$0;

        AnchorInfo(androidx.recyclerview.widget.StaggeredGridLayoutManager r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.reset()
                return
        }

        void assignCoordinateFromPadding() {
                r1 = this;
                boolean r0 = r1.mLayoutFromEnd
                if (r0 == 0) goto Ld
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r1.this$0
                androidx.recyclerview.widget.OrientationHelper r0 = r0.mPrimaryOrientation
                int r0 = r0.getEndAfterPadding()
                goto L15
            Ld:
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r1.this$0
                androidx.recyclerview.widget.OrientationHelper r0 = r0.mPrimaryOrientation
                int r0 = r0.getStartAfterPadding()
            L15:
                r1.mOffset = r0
                return
        }

        void assignCoordinateFromPadding(int r2) {
                r1 = this;
                boolean r0 = r1.mLayoutFromEnd
                if (r0 == 0) goto L10
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r1.this$0
                androidx.recyclerview.widget.OrientationHelper r0 = r0.mPrimaryOrientation
                int r0 = r0.getEndAfterPadding()
                int r0 = r0 - r2
                r1.mOffset = r0
                return
            L10:
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r1.this$0
                androidx.recyclerview.widget.OrientationHelper r0 = r0.mPrimaryOrientation
                int r0 = r0.getStartAfterPadding()
                int r0 = r0 + r2
                r1.mOffset = r0
                return
        }

        void reset() {
                r2 = this;
                r0 = -1
                r2.mPosition = r0
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2.mOffset = r1
                r1 = 0
                r2.mLayoutFromEnd = r1
                r2.mInvalidateOffsets = r1
                r2.mValid = r1
                int[] r1 = r2.mSpanReferenceLines
                if (r1 == 0) goto L15
                java.util.Arrays.fill(r1, r0)
            L15:
                return
        }

        void saveSpanReferenceLines(androidx.recyclerview.widget.StaggeredGridLayoutManager.Span[] r6) {
                r5 = this;
                int r0 = r6.length
                int[] r1 = r5.mSpanReferenceLines
                if (r1 == 0) goto L8
                int r1 = r1.length
                if (r1 >= r0) goto L11
            L8:
                androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = r5.this$0
                androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r1 = r1.mSpans
                int r1 = r1.length
                int[] r1 = new int[r1]
                r5.mSpanReferenceLines = r1
            L11:
                r1 = 0
            L12:
                if (r1 >= r0) goto L23
                int[] r2 = r5.mSpanReferenceLines
                r3 = r6[r1]
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                int r3 = r3.getStartLine(r4)
                r2[r1] = r3
                int r1 = r1 + 1
                goto L12
            L23:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class LayoutParams extends androidx.recyclerview.widget.RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        boolean mFullSpan;
        androidx.recyclerview.widget.StaggeredGridLayoutManager.Span mSpan;

        public LayoutParams(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public LayoutParams(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public LayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public final int getSpanIndex() {
                r1 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r0 = r1.mSpan
                if (r0 != 0) goto L6
                r0 = -1
                return r0
            L6:
                int r0 = r0.mIndex
                return r0
        }

        public boolean isFullSpan() {
                r1 = this;
                boolean r0 = r1.mFullSpan
                return r0
        }

        public void setFullSpan(boolean r1) {
                r0 = this;
                r0.mFullSpan = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class LazySpanLookup {
        private static final int MIN_SIZE = 10;
        int[] mData;
        java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem> mFullSpanItems;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @android.annotation.SuppressLint({"BanParcelableUsage"})
        static class FullSpanItem implements android.os.Parcelable {
            public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem> CREATOR = null;
            int mGapDir;
            int[] mGapPerSpan;
            boolean mHasUnwantedGapAfter;
            int mPosition;


            static {
                    androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1
                    r0.<init>()
                    androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.CREATOR = r0
                    return
            }

            FullSpanItem() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            FullSpanItem(android.os.Parcel r3) {
                    r2 = this;
                    r2.<init>()
                    int r0 = r3.readInt()
                    r2.mPosition = r0
                    int r0 = r3.readInt()
                    r2.mGapDir = r0
                    int r0 = r3.readInt()
                    r1 = 1
                    if (r0 != r1) goto L17
                    goto L18
                L17:
                    r1 = 0
                L18:
                    r2.mHasUnwantedGapAfter = r1
                    int r0 = r3.readInt()
                    if (r0 <= 0) goto L27
                    int[] r0 = new int[r0]
                    r2.mGapPerSpan = r0
                    r3.readIntArray(r0)
                L27:
                    return
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            int getGapForSpan(int r2) {
                    r1 = this;
                    int[] r0 = r1.mGapPerSpan
                    if (r0 != 0) goto L6
                    r2 = 0
                    return r2
                L6:
                    r2 = r0[r2]
                    return r2
            }

            public java.lang.String toString() {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "FullSpanItem{mPosition="
                    r0.append(r1)
                    int r1 = r2.mPosition
                    r0.append(r1)
                    java.lang.String r1 = ", mGapDir="
                    r0.append(r1)
                    int r1 = r2.mGapDir
                    r0.append(r1)
                    java.lang.String r1 = ", mHasUnwantedGapAfter="
                    r0.append(r1)
                    boolean r1 = r2.mHasUnwantedGapAfter
                    r0.append(r1)
                    java.lang.String r1 = ", mGapPerSpan="
                    r0.append(r1)
                    int[] r1 = r2.mGapPerSpan
                    java.lang.String r1 = java.util.Arrays.toString(r1)
                    r0.append(r1)
                    r1 = 125(0x7d, float:1.75E-43)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel r2, int r3) {
                    r1 = this;
                    int r3 = r1.mPosition
                    r2.writeInt(r3)
                    int r3 = r1.mGapDir
                    r2.writeInt(r3)
                    boolean r3 = r1.mHasUnwantedGapAfter
                    r2.writeInt(r3)
                    int[] r3 = r1.mGapPerSpan
                    if (r3 == 0) goto L20
                    int r0 = r3.length
                    if (r0 <= 0) goto L20
                    int r3 = r3.length
                    r2.writeInt(r3)
                    int[] r3 = r1.mGapPerSpan
                    r2.writeIntArray(r3)
                    return
                L20:
                    r3 = 0
                    r2.writeInt(r3)
                    return
            }
        }

        LazySpanLookup() {
                r0 = this;
                r0.<init>()
                return
        }

        private int invalidateFullSpansAfter(int r5) {
                r4 = this;
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r4.mFullSpanItems
                r1 = -1
                if (r0 != 0) goto L6
                return r1
            L6:
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = r4.getFullSpanItem(r5)
                if (r0 == 0) goto L11
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r2 = r4.mFullSpanItems
                r2.remove(r0)
            L11:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r4.mFullSpanItems
                int r0 = r0.size()
                r2 = 0
            L18:
                if (r2 >= r0) goto L2a
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r4.mFullSpanItems
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r3
                int r3 = r3.mPosition
                if (r3 < r5) goto L27
                goto L2b
            L27:
                int r2 = r2 + 1
                goto L18
            L2a:
                r2 = -1
            L2b:
                if (r2 == r1) goto L3d
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r5 = r4.mFullSpanItems
                java.lang.Object r5 = r5.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r5 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r5
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r4.mFullSpanItems
                r0.remove(r2)
                int r5 = r5.mPosition
                return r5
            L3d:
                return r1
        }

        private void offsetFullSpansForAddition(int r4, int r5) {
                r3 = this;
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r3.mFullSpanItems
                if (r0 != 0) goto L5
                goto L20
            L5:
                int r0 = r0.size()
                int r0 = r0 + (-1)
            Lb:
                if (r0 < 0) goto L20
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r1 = r3.mFullSpanItems
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r1
                int r2 = r1.mPosition
                if (r2 >= r4) goto L1a
                goto L1d
            L1a:
                int r2 = r2 + r5
                r1.mPosition = r2
            L1d:
                int r0 = r0 + (-1)
                goto Lb
            L20:
                return
        }

        private void offsetFullSpansForRemoval(int r5, int r6) {
                r4 = this;
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r4.mFullSpanItems
                if (r0 != 0) goto L5
                goto L2a
            L5:
                int r1 = r5 + r6
                int r0 = r0.size()
                int r0 = r0 + (-1)
            Ld:
                if (r0 < 0) goto L2a
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r2 = r4.mFullSpanItems
                java.lang.Object r2 = r2.get(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r2
                int r3 = r2.mPosition
                if (r3 >= r5) goto L1c
                goto L27
            L1c:
                if (r3 >= r1) goto L24
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r2 = r4.mFullSpanItems
                r2.remove(r0)
                goto L27
            L24:
                int r3 = r3 - r6
                r2.mPosition = r3
            L27:
                int r0 = r0 + (-1)
                goto Ld
            L2a:
                return
        }

        public void addFullSpanItem(androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem r6) {
                r5 = this;
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r5.mFullSpanItems
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r5.mFullSpanItems = r0
            Lb:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r5.mFullSpanItems
                int r0 = r0.size()
                r1 = 0
            L12:
                if (r1 >= r0) goto L36
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r2 = r5.mFullSpanItems
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r2
                int r3 = r2.mPosition
                int r4 = r6.mPosition
                if (r3 != r4) goto L27
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r5.mFullSpanItems
                r3.remove(r1)
            L27:
                int r2 = r2.mPosition
                int r3 = r6.mPosition
                if (r2 < r3) goto L33
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r5.mFullSpanItems
                r0.add(r1, r6)
                return
            L33:
                int r1 = r1 + 1
                goto L12
            L36:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r5.mFullSpanItems
                r0.add(r6)
                return
        }

        void clear() {
                r2 = this;
                int[] r0 = r2.mData
                if (r0 == 0) goto L8
                r1 = -1
                java.util.Arrays.fill(r0, r1)
            L8:
                r0 = 0
                r2.mFullSpanItems = r0
                return
        }

        void ensureSize(int r5) {
                r4 = this;
                int[] r0 = r4.mData
                r1 = -1
                if (r0 != 0) goto L15
                r0 = 10
                int r5 = java.lang.Math.max(r5, r0)
                int r5 = r5 + 1
                int[] r5 = new int[r5]
                r4.mData = r5
                java.util.Arrays.fill(r5, r1)
                return
            L15:
                int r2 = r0.length
                if (r5 < r2) goto L2c
                int r5 = r4.sizeForPosition(r5)
                int[] r5 = new int[r5]
                r4.mData = r5
                int r2 = r0.length
                r3 = 0
                java.lang.System.arraycopy(r0, r3, r5, r3, r2)
                int[] r5 = r4.mData
                int r0 = r0.length
                int r2 = r5.length
                java.util.Arrays.fill(r5, r0, r2, r1)
            L2c:
                return
        }

        int forceInvalidateAfter(int r3) {
                r2 = this;
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r2.mFullSpanItems
                if (r0 == 0) goto L20
                int r0 = r0.size()
                int r0 = r0 + (-1)
            La:
                if (r0 < 0) goto L20
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r1 = r2.mFullSpanItems
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r1
                int r1 = r1.mPosition
                if (r1 < r3) goto L1d
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r1 = r2.mFullSpanItems
                r1.remove(r0)
            L1d:
                int r0 = r0 + (-1)
                goto La
            L20:
                int r3 = r2.invalidateAfter(r3)
                return r3
        }

        public androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem getFirstFullSpanItemInRange(int r6, int r7, int r8, boolean r9) {
                r5 = this;
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r5.mFullSpanItems
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                int r0 = r0.size()
                r2 = 0
            Lb:
                if (r2 >= r0) goto L2c
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r5.mFullSpanItems
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r3
                int r4 = r3.mPosition
                if (r4 < r7) goto L1a
                return r1
            L1a:
                if (r4 < r6) goto L29
                if (r8 == 0) goto L28
                int r4 = r3.mGapDir
                if (r4 == r8) goto L28
                if (r9 == 0) goto L29
                boolean r4 = r3.mHasUnwantedGapAfter
                if (r4 == 0) goto L29
            L28:
                return r3
            L29:
                int r2 = r2 + 1
                goto Lb
            L2c:
                return r1
        }

        public androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem getFullSpanItem(int r5) {
                r4 = this;
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r4.mFullSpanItems
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                int r0 = r0.size()
                int r0 = r0 + (-1)
            Lc:
                if (r0 < 0) goto L1e
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r2 = r4.mFullSpanItems
                java.lang.Object r2 = r2.get(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r2
                int r3 = r2.mPosition
                if (r3 != r5) goto L1b
                return r2
            L1b:
                int r0 = r0 + (-1)
                goto Lc
            L1e:
                return r1
        }

        int getSpan(int r3) {
                r2 = this;
                int[] r0 = r2.mData
                if (r0 == 0) goto Lb
                int r1 = r0.length
                if (r3 < r1) goto L8
                goto Lb
            L8:
                r3 = r0[r3]
                return r3
            Lb:
                r3 = -1
                return r3
        }

        int invalidateAfter(int r4) {
                r3 = this;
                int[] r0 = r3.mData
                r1 = -1
                if (r0 != 0) goto L6
                return r1
            L6:
                int r0 = r0.length
                if (r4 < r0) goto La
                return r1
            La:
                int r0 = r3.invalidateFullSpansAfter(r4)
                if (r0 != r1) goto L1a
                int[] r0 = r3.mData
                int r2 = r0.length
                java.util.Arrays.fill(r0, r4, r2, r1)
                int[] r4 = r3.mData
                int r4 = r4.length
                return r4
            L1a:
                int r0 = r0 + 1
                int[] r2 = r3.mData
                int r2 = r2.length
                int r0 = java.lang.Math.min(r0, r2)
                int[] r2 = r3.mData
                java.util.Arrays.fill(r2, r4, r0, r1)
                return r0
        }

        void offsetForAddition(int r4, int r5) {
                r3 = this;
                int[] r0 = r3.mData
                if (r0 == 0) goto L1e
                int r0 = r0.length
                if (r4 < r0) goto L8
                goto L1e
            L8:
                int r0 = r4 + r5
                r3.ensureSize(r0)
                int[] r1 = r3.mData
                int r2 = r1.length
                int r2 = r2 - r4
                int r2 = r2 - r5
                java.lang.System.arraycopy(r1, r4, r1, r0, r2)
                int[] r1 = r3.mData
                r2 = -1
                java.util.Arrays.fill(r1, r4, r0, r2)
                r3.offsetFullSpansForAddition(r4, r5)
            L1e:
                return
        }

        void offsetForRemoval(int r5, int r6) {
                r4 = this;
                int[] r0 = r4.mData
                if (r0 == 0) goto L21
                int r0 = r0.length
                if (r5 < r0) goto L8
                goto L21
            L8:
                int r0 = r5 + r6
                r4.ensureSize(r0)
                int[] r1 = r4.mData
                int r2 = r1.length
                int r2 = r2 - r5
                int r2 = r2 - r6
                java.lang.System.arraycopy(r1, r0, r1, r5, r2)
                int[] r0 = r4.mData
                int r1 = r0.length
                int r1 = r1 - r6
                int r2 = r0.length
                r3 = -1
                java.util.Arrays.fill(r0, r1, r2, r3)
                r4.offsetFullSpansForRemoval(r5, r6)
            L21:
                return
        }

        void setSpan(int r2, androidx.recyclerview.widget.StaggeredGridLayoutManager.Span r3) {
                r1 = this;
                r1.ensureSize(r2)
                int[] r0 = r1.mData
                int r3 = r3.mIndex
                r0[r2] = r3
                return
        }

        int sizeForPosition(int r2) {
                r1 = this;
                int[] r0 = r1.mData
                int r0 = r0.length
            L3:
                if (r0 > r2) goto L8
                int r0 = r0 * 2
                goto L3
            L8:
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @android.annotation.SuppressLint({"BanParcelableUsage"})
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static class SavedState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState> CREATOR = null;
        boolean mAnchorLayoutFromEnd;
        int mAnchorPosition;
        java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem> mFullSpanItems;
        boolean mLastLayoutRTL;
        boolean mReverseLayout;
        int[] mSpanLookup;
        int mSpanLookupSize;
        int[] mSpanOffsets;
        int mSpanOffsetsSize;
        int mVisibleAnchorPosition;


        static {
                androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$1 r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$1
                r0.<init>()
                androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState.CREATOR = r0
                return
        }

        public SavedState() {
                r0 = this;
                r0.<init>()
                return
        }

        SavedState(android.os.Parcel r4) {
                r3 = this;
                r3.<init>()
                int r0 = r4.readInt()
                r3.mAnchorPosition = r0
                int r0 = r4.readInt()
                r3.mVisibleAnchorPosition = r0
                int r0 = r4.readInt()
                r3.mSpanOffsetsSize = r0
                if (r0 <= 0) goto L1e
                int[] r0 = new int[r0]
                r3.mSpanOffsets = r0
                r4.readIntArray(r0)
            L1e:
                int r0 = r4.readInt()
                r3.mSpanLookupSize = r0
                if (r0 <= 0) goto L2d
                int[] r0 = new int[r0]
                r3.mSpanLookup = r0
                r4.readIntArray(r0)
            L2d:
                int r0 = r4.readInt()
                r1 = 0
                r2 = 1
                if (r0 != r2) goto L37
                r0 = 1
                goto L38
            L37:
                r0 = 0
            L38:
                r3.mReverseLayout = r0
                int r0 = r4.readInt()
                if (r0 != r2) goto L42
                r0 = 1
                goto L43
            L42:
                r0 = 0
            L43:
                r3.mAnchorLayoutFromEnd = r0
                int r0 = r4.readInt()
                if (r0 != r2) goto L4c
                r1 = 1
            L4c:
                r3.mLastLayoutRTL = r1
                java.lang.Class<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                java.util.ArrayList r4 = r4.readArrayList(r0)
                r3.mFullSpanItems = r4
                return
        }

        public SavedState(androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.mSpanOffsetsSize
                r1.mSpanOffsetsSize = r0
                int r0 = r2.mAnchorPosition
                r1.mAnchorPosition = r0
                int r0 = r2.mVisibleAnchorPosition
                r1.mVisibleAnchorPosition = r0
                int[] r0 = r2.mSpanOffsets
                r1.mSpanOffsets = r0
                int r0 = r2.mSpanLookupSize
                r1.mSpanLookupSize = r0
                int[] r0 = r2.mSpanLookup
                r1.mSpanLookup = r0
                boolean r0 = r2.mReverseLayout
                r1.mReverseLayout = r0
                boolean r0 = r2.mAnchorLayoutFromEnd
                r1.mAnchorLayoutFromEnd = r0
                boolean r0 = r2.mLastLayoutRTL
                r1.mLastLayoutRTL = r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r2 = r2.mFullSpanItems
                r1.mFullSpanItems = r2
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        void invalidateAnchorPositionInfo() {
                r1 = this;
                r0 = 0
                r1.mSpanOffsets = r0
                r0 = 0
                r1.mSpanOffsetsSize = r0
                r0 = -1
                r1.mAnchorPosition = r0
                r1.mVisibleAnchorPosition = r0
                return
        }

        void invalidateSpanInfo() {
                r2 = this;
                r0 = 0
                r2.mSpanOffsets = r0
                r1 = 0
                r2.mSpanOffsetsSize = r1
                r2.mSpanLookupSize = r1
                r2.mSpanLookup = r0
                r2.mFullSpanItems = r0
                return
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                int r2 = r0.mAnchorPosition
                r1.writeInt(r2)
                int r2 = r0.mVisibleAnchorPosition
                r1.writeInt(r2)
                int r2 = r0.mSpanOffsetsSize
                r1.writeInt(r2)
                int r2 = r0.mSpanOffsetsSize
                if (r2 <= 0) goto L18
                int[] r2 = r0.mSpanOffsets
                r1.writeIntArray(r2)
            L18:
                int r2 = r0.mSpanLookupSize
                r1.writeInt(r2)
                int r2 = r0.mSpanLookupSize
                if (r2 <= 0) goto L26
                int[] r2 = r0.mSpanLookup
                r1.writeIntArray(r2)
            L26:
                boolean r2 = r0.mReverseLayout
                r1.writeInt(r2)
                boolean r2 = r0.mAnchorLayoutFromEnd
                r1.writeInt(r2)
                boolean r2 = r0.mLastLayoutRTL
                r1.writeInt(r2)
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r2 = r0.mFullSpanItems
                r1.writeList(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class Span {
        static final int INVALID_LINE = Integer.MIN_VALUE;
        int mCachedEnd;
        int mCachedStart;
        int mDeletedSize;
        final int mIndex;
        java.util.ArrayList<android.view.View> mViews;
        final /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager this$0;

        Span(androidx.recyclerview.widget.StaggeredGridLayoutManager r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.mViews = r1
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0.mCachedStart = r1
                r0.mCachedEnd = r1
                r1 = 0
                r0.mDeletedSize = r1
                r0.mIndex = r2
                return
        }

        void appendToSpan(android.view.View r5) {
                r4 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r0 = r4.getLayoutParams(r5)
                r0.mSpan = r4
                java.util.ArrayList<android.view.View> r1 = r4.mViews
                r1.add(r5)
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r4.mCachedEnd = r1
                java.util.ArrayList<android.view.View> r2 = r4.mViews
                int r2 = r2.size()
                r3 = 1
                if (r2 != r3) goto L1a
                r4.mCachedStart = r1
            L1a:
                boolean r1 = r0.isItemRemoved()
                if (r1 != 0) goto L28
                boolean r0 = r0.isItemChanged()
                if (r0 == 0) goto L27
                goto L28
            L27:
                return
            L28:
                int r0 = r4.mDeletedSize
                androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = r4.this$0
                androidx.recyclerview.widget.OrientationHelper r1 = r1.mPrimaryOrientation
                int r5 = r1.getDecoratedMeasurement(r5)
                int r0 = r0 + r5
                r4.mDeletedSize = r0
                return
        }

        void cacheReferenceLineAndClear(boolean r4, int r5) {
                r3 = this;
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r4 == 0) goto L9
                int r1 = r3.getEndLine(r0)
                goto Ld
            L9:
                int r1 = r3.getStartLine(r0)
            Ld:
                r3.clear()
                if (r1 != r0) goto L13
                goto L2b
            L13:
                if (r4 == 0) goto L1f
                androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = r3.this$0
                androidx.recyclerview.widget.OrientationHelper r2 = r2.mPrimaryOrientation
                int r2 = r2.getEndAfterPadding()
                if (r1 < r2) goto L2b
            L1f:
                if (r4 != 0) goto L2c
                androidx.recyclerview.widget.StaggeredGridLayoutManager r4 = r3.this$0
                androidx.recyclerview.widget.OrientationHelper r4 = r4.mPrimaryOrientation
                int r4 = r4.getStartAfterPadding()
                if (r1 <= r4) goto L2c
            L2b:
                return
            L2c:
                if (r5 == r0) goto L2f
                int r1 = r1 + r5
            L2f:
                r3.mCachedEnd = r1
                r3.mCachedStart = r1
                return
        }

        void calculateCachedEnd() {
                r4 = this;
                java.util.ArrayList<android.view.View> r0 = r4.mViews
                int r1 = r0.size()
                r2 = 1
                int r1 = r1 - r2
                java.lang.Object r0 = r0.get(r1)
                android.view.View r0 = (android.view.View) r0
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r1 = r4.getLayoutParams(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager r3 = r4.this$0
                androidx.recyclerview.widget.OrientationHelper r3 = r3.mPrimaryOrientation
                int r0 = r3.getDecoratedEnd(r0)
                r4.mCachedEnd = r0
                boolean r0 = r1.mFullSpan
                if (r0 == 0) goto L3d
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r4.this$0
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r0.mLazySpanLookup
                int r1 = r1.getViewLayoutPosition()
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = r0.getFullSpanItem(r1)
                if (r0 == 0) goto L3d
                int r1 = r0.mGapDir
                if (r1 != r2) goto L3d
                int r1 = r4.mCachedEnd
                int r2 = r4.mIndex
                int r0 = r0.getGapForSpan(r2)
                int r1 = r1 + r0
                r4.mCachedEnd = r1
            L3d:
                return
        }

        void calculateCachedStart() {
                r3 = this;
                java.util.ArrayList<android.view.View> r0 = r3.mViews
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                android.view.View r0 = (android.view.View) r0
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r1 = r3.getLayoutParams(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = r3.this$0
                androidx.recyclerview.widget.OrientationHelper r2 = r2.mPrimaryOrientation
                int r0 = r2.getDecoratedStart(r0)
                r3.mCachedStart = r0
                boolean r0 = r1.mFullSpan
                if (r0 == 0) goto L39
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r3.this$0
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r0.mLazySpanLookup
                int r1 = r1.getViewLayoutPosition()
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = r0.getFullSpanItem(r1)
                if (r0 == 0) goto L39
                int r1 = r0.mGapDir
                r2 = -1
                if (r1 != r2) goto L39
                int r1 = r3.mCachedStart
                int r2 = r3.mIndex
                int r0 = r0.getGapForSpan(r2)
                int r1 = r1 - r0
                r3.mCachedStart = r1
            L39:
                return
        }

        void clear() {
                r1 = this;
                java.util.ArrayList<android.view.View> r0 = r1.mViews
                r0.clear()
                r1.invalidateCache()
                r0 = 0
                r1.mDeletedSize = r0
                return
        }

        public int findFirstCompletelyVisibleItemPosition() {
                r3 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r3.this$0
                boolean r0 = r0.mReverseLayout
                r1 = 1
                if (r0 == 0) goto L14
                java.util.ArrayList<android.view.View> r0 = r3.mViews
                int r0 = r0.size()
                int r0 = r0 - r1
                r2 = -1
                int r0 = r3.findOneVisibleChild(r0, r2, r1)
                return r0
            L14:
                java.util.ArrayList<android.view.View> r0 = r3.mViews
                int r0 = r0.size()
                r2 = 0
                int r0 = r3.findOneVisibleChild(r2, r0, r1)
                return r0
        }

        public int findFirstPartiallyVisibleItemPosition() {
                r3 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r3.this$0
                boolean r0 = r0.mReverseLayout
                r1 = 1
                if (r0 == 0) goto L14
                java.util.ArrayList<android.view.View> r0 = r3.mViews
                int r0 = r0.size()
                int r0 = r0 - r1
                r2 = -1
                int r0 = r3.findOnePartiallyVisibleChild(r0, r2, r1)
                return r0
            L14:
                java.util.ArrayList<android.view.View> r0 = r3.mViews
                int r0 = r0.size()
                r2 = 0
                int r0 = r3.findOnePartiallyVisibleChild(r2, r0, r1)
                return r0
        }

        public int findFirstVisibleItemPosition() {
                r3 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r3.this$0
                boolean r0 = r0.mReverseLayout
                r1 = 0
                if (r0 == 0) goto L15
                java.util.ArrayList<android.view.View> r0 = r3.mViews
                int r0 = r0.size()
                int r0 = r0 + (-1)
                r2 = -1
                int r0 = r3.findOneVisibleChild(r0, r2, r1)
                return r0
            L15:
                java.util.ArrayList<android.view.View> r0 = r3.mViews
                int r0 = r0.size()
                int r0 = r3.findOneVisibleChild(r1, r0, r1)
                return r0
        }

        public int findLastCompletelyVisibleItemPosition() {
                r3 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r3.this$0
                boolean r0 = r0.mReverseLayout
                r1 = 1
                if (r0 == 0) goto L13
                java.util.ArrayList<android.view.View> r0 = r3.mViews
                int r0 = r0.size()
                r2 = 0
                int r0 = r3.findOneVisibleChild(r2, r0, r1)
                return r0
            L13:
                java.util.ArrayList<android.view.View> r0 = r3.mViews
                int r0 = r0.size()
                int r0 = r0 - r1
                r2 = -1
                int r0 = r3.findOneVisibleChild(r0, r2, r1)
                return r0
        }

        public int findLastPartiallyVisibleItemPosition() {
                r3 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r3.this$0
                boolean r0 = r0.mReverseLayout
                r1 = 1
                if (r0 == 0) goto L13
                java.util.ArrayList<android.view.View> r0 = r3.mViews
                int r0 = r0.size()
                r2 = 0
                int r0 = r3.findOnePartiallyVisibleChild(r2, r0, r1)
                return r0
            L13:
                java.util.ArrayList<android.view.View> r0 = r3.mViews
                int r0 = r0.size()
                int r0 = r0 - r1
                r2 = -1
                int r0 = r3.findOnePartiallyVisibleChild(r0, r2, r1)
                return r0
        }

        public int findLastVisibleItemPosition() {
                r3 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r3.this$0
                boolean r0 = r0.mReverseLayout
                r1 = 0
                if (r0 == 0) goto L12
                java.util.ArrayList<android.view.View> r0 = r3.mViews
                int r0 = r0.size()
                int r0 = r3.findOneVisibleChild(r1, r0, r1)
                return r0
            L12:
                java.util.ArrayList<android.view.View> r0 = r3.mViews
                int r0 = r0.size()
                int r0 = r0 + (-1)
                r2 = -1
                int r0 = r3.findOneVisibleChild(r0, r2, r1)
                return r0
        }

        int findOnePartiallyOrCompletelyVisibleChild(int r11, int r12, boolean r13, boolean r14, boolean r15) {
                r10 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r10.this$0
                androidx.recyclerview.widget.OrientationHelper r0 = r0.mPrimaryOrientation
                int r0 = r0.getStartAfterPadding()
                androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = r10.this$0
                androidx.recyclerview.widget.OrientationHelper r1 = r1.mPrimaryOrientation
                int r1 = r1.getEndAfterPadding()
                r2 = -1
                r3 = 1
                if (r12 <= r11) goto L16
                r4 = 1
                goto L17
            L16:
                r4 = -1
            L17:
                if (r11 == r12) goto L6f
                java.util.ArrayList<android.view.View> r5 = r10.mViews
                java.lang.Object r5 = r5.get(r11)
                android.view.View r5 = (android.view.View) r5
                androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = r10.this$0
                androidx.recyclerview.widget.OrientationHelper r6 = r6.mPrimaryOrientation
                int r6 = r6.getDecoratedStart(r5)
                androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = r10.this$0
                androidx.recyclerview.widget.OrientationHelper r7 = r7.mPrimaryOrientation
                int r7 = r7.getDecoratedEnd(r5)
                r8 = 0
                if (r15 == 0) goto L3a
                if (r6 > r1) goto L38
            L36:
                r9 = 1
                goto L3d
            L38:
                r9 = 0
                goto L3d
            L3a:
                if (r6 >= r1) goto L38
                goto L36
            L3d:
                if (r15 == 0) goto L43
                if (r7 < r0) goto L46
            L41:
                r8 = 1
                goto L46
            L43:
                if (r7 <= r0) goto L46
                goto L41
            L46:
                if (r9 == 0) goto L6d
                if (r8 == 0) goto L6d
                if (r13 == 0) goto L59
                if (r14 == 0) goto L59
                if (r6 < r0) goto L6d
                if (r7 > r1) goto L6d
                androidx.recyclerview.widget.StaggeredGridLayoutManager r11 = r10.this$0
                int r11 = r11.getPosition(r5)
                return r11
            L59:
                if (r14 == 0) goto L62
                androidx.recyclerview.widget.StaggeredGridLayoutManager r11 = r10.this$0
                int r11 = r11.getPosition(r5)
                return r11
            L62:
                if (r6 < r0) goto L66
                if (r7 <= r1) goto L6d
            L66:
                androidx.recyclerview.widget.StaggeredGridLayoutManager r11 = r10.this$0
                int r11 = r11.getPosition(r5)
                return r11
            L6d:
                int r11 = r11 + r4
                goto L17
            L6f:
                return r2
        }

        int findOnePartiallyVisibleChild(int r7, int r8, boolean r9) {
                r6 = this;
                r3 = 0
                r4 = 0
                r0 = r6
                r1 = r7
                r2 = r8
                r5 = r9
                int r7 = r0.findOnePartiallyOrCompletelyVisibleChild(r1, r2, r3, r4, r5)
                return r7
        }

        int findOneVisibleChild(int r7, int r8, boolean r9) {
                r6 = this;
                r4 = 1
                r5 = 0
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                int r7 = r0.findOnePartiallyOrCompletelyVisibleChild(r1, r2, r3, r4, r5)
                return r7
        }

        public int getDeletedSize() {
                r1 = this;
                int r0 = r1.mDeletedSize
                return r0
        }

        int getEndLine() {
                r2 = this;
                int r0 = r2.mCachedEnd
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r1) goto L7
                return r0
            L7:
                r2.calculateCachedEnd()
                int r0 = r2.mCachedEnd
                return r0
        }

        int getEndLine(int r3) {
                r2 = this;
                int r0 = r2.mCachedEnd
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r1) goto L7
                return r0
            L7:
                java.util.ArrayList<android.view.View> r0 = r2.mViews
                int r0 = r0.size()
                if (r0 != 0) goto L10
                return r3
            L10:
                r2.calculateCachedEnd()
                int r3 = r2.mCachedEnd
                return r3
        }

        public android.view.View getFocusableViewAfter(int r6, int r7) {
                r5 = this;
                r0 = -1
                r1 = 0
                if (r7 != r0) goto L39
                java.util.ArrayList<android.view.View> r7 = r5.mViews
                int r7 = r7.size()
                r0 = 0
            Lb:
                if (r0 >= r7) goto L38
                java.util.ArrayList<android.view.View> r2 = r5.mViews
                java.lang.Object r2 = r2.get(r0)
                android.view.View r2 = (android.view.View) r2
                androidx.recyclerview.widget.StaggeredGridLayoutManager r3 = r5.this$0
                boolean r4 = r3.mReverseLayout
                if (r4 == 0) goto L21
                int r3 = r3.getPosition(r2)
                if (r3 <= r6) goto L38
            L21:
                androidx.recyclerview.widget.StaggeredGridLayoutManager r3 = r5.this$0
                boolean r4 = r3.mReverseLayout
                if (r4 != 0) goto L2e
                int r3 = r3.getPosition(r2)
                if (r3 < r6) goto L2e
                goto L38
            L2e:
                boolean r3 = r2.hasFocusable()
                if (r3 == 0) goto L38
                int r0 = r0 + 1
                r1 = r2
                goto Lb
            L38:
                return r1
            L39:
                java.util.ArrayList<android.view.View> r7 = r5.mViews
                int r7 = r7.size()
                int r7 = r7 + (-1)
            L41:
                if (r7 < 0) goto L6e
                java.util.ArrayList<android.view.View> r0 = r5.mViews
                java.lang.Object r0 = r0.get(r7)
                android.view.View r0 = (android.view.View) r0
                androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = r5.this$0
                boolean r3 = r2.mReverseLayout
                if (r3 == 0) goto L57
                int r2 = r2.getPosition(r0)
                if (r2 >= r6) goto L6e
            L57:
                androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = r5.this$0
                boolean r3 = r2.mReverseLayout
                if (r3 != 0) goto L64
                int r2 = r2.getPosition(r0)
                if (r2 > r6) goto L64
                goto L6e
            L64:
                boolean r2 = r0.hasFocusable()
                if (r2 == 0) goto L6e
                int r7 = r7 + (-1)
                r1 = r0
                goto L41
            L6e:
                return r1
        }

        androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams getLayoutParams(android.view.View r1) {
                r0 = this;
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r1
                return r1
        }

        int getStartLine() {
                r2 = this;
                int r0 = r2.mCachedStart
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r1) goto L7
                return r0
            L7:
                r2.calculateCachedStart()
                int r0 = r2.mCachedStart
                return r0
        }

        int getStartLine(int r3) {
                r2 = this;
                int r0 = r2.mCachedStart
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r1) goto L7
                return r0
            L7:
                java.util.ArrayList<android.view.View> r0 = r2.mViews
                int r0 = r0.size()
                if (r0 != 0) goto L10
                return r3
            L10:
                r2.calculateCachedStart()
                int r3 = r2.mCachedStart
                return r3
        }

        void invalidateCache() {
                r1 = this;
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1.mCachedStart = r0
                r1.mCachedEnd = r0
                return
        }

        void onOffset(int r3) {
                r2 = this;
                int r0 = r2.mCachedStart
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r1) goto L9
                int r0 = r0 + r3
                r2.mCachedStart = r0
            L9:
                int r0 = r2.mCachedEnd
                if (r0 == r1) goto L10
                int r0 = r0 + r3
                r2.mCachedEnd = r0
            L10:
                return
        }

        void popEnd() {
                r4 = this;
                java.util.ArrayList<android.view.View> r0 = r4.mViews
                int r0 = r0.size()
                java.util.ArrayList<android.view.View> r1 = r4.mViews
                int r2 = r0 + (-1)
                java.lang.Object r1 = r1.remove(r2)
                android.view.View r1 = (android.view.View) r1
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r2 = r4.getLayoutParams(r1)
                r3 = 0
                r2.mSpan = r3
                boolean r3 = r2.isItemRemoved()
                if (r3 != 0) goto L23
                boolean r2 = r2.isItemChanged()
                if (r2 == 0) goto L30
            L23:
                int r2 = r4.mDeletedSize
                androidx.recyclerview.widget.StaggeredGridLayoutManager r3 = r4.this$0
                androidx.recyclerview.widget.OrientationHelper r3 = r3.mPrimaryOrientation
                int r1 = r3.getDecoratedMeasurement(r1)
                int r2 = r2 - r1
                r4.mDeletedSize = r2
            L30:
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = 1
                if (r0 != r2) goto L37
                r4.mCachedStart = r1
            L37:
                r4.mCachedEnd = r1
                return
        }

        void popStart() {
                r4 = this;
                java.util.ArrayList<android.view.View> r0 = r4.mViews
                r1 = 0
                java.lang.Object r0 = r0.remove(r1)
                android.view.View r0 = (android.view.View) r0
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r1 = r4.getLayoutParams(r0)
                r2 = 0
                r1.mSpan = r2
                java.util.ArrayList<android.view.View> r2 = r4.mViews
                int r2 = r2.size()
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r2 != 0) goto L1c
                r4.mCachedEnd = r3
            L1c:
                boolean r2 = r1.isItemRemoved()
                if (r2 != 0) goto L28
                boolean r1 = r1.isItemChanged()
                if (r1 == 0) goto L35
            L28:
                int r1 = r4.mDeletedSize
                androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = r4.this$0
                androidx.recyclerview.widget.OrientationHelper r2 = r2.mPrimaryOrientation
                int r0 = r2.getDecoratedMeasurement(r0)
                int r1 = r1 - r0
                r4.mDeletedSize = r1
            L35:
                r4.mCachedStart = r3
                return
        }

        void prependToSpan(android.view.View r5) {
                r4 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r0 = r4.getLayoutParams(r5)
                r0.mSpan = r4
                java.util.ArrayList<android.view.View> r1 = r4.mViews
                r2 = 0
                r1.add(r2, r5)
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r4.mCachedStart = r1
                java.util.ArrayList<android.view.View> r2 = r4.mViews
                int r2 = r2.size()
                r3 = 1
                if (r2 != r3) goto L1b
                r4.mCachedEnd = r1
            L1b:
                boolean r1 = r0.isItemRemoved()
                if (r1 != 0) goto L29
                boolean r0 = r0.isItemChanged()
                if (r0 == 0) goto L28
                goto L29
            L28:
                return
            L29:
                int r0 = r4.mDeletedSize
                androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = r4.this$0
                androidx.recyclerview.widget.OrientationHelper r1 = r1.mPrimaryOrientation
                int r5 = r1.getDecoratedMeasurement(r5)
                int r0 = r0 + r5
                r4.mDeletedSize = r0
                return
        }

        void setLine(int r1) {
                r0 = this;
                r0.mCachedStart = r1
                r0.mCachedEnd = r1
                return
        }
    }

    public StaggeredGridLayoutManager(int r3, int r4) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.mSpanCount = r0
            r1 = 0
            r2.mReverseLayout = r1
            r2.mShouldReverseLayout = r1
            r2.mPendingScrollPosition = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.mPendingScrollPositionOffset = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup
            r0.<init>()
            r2.mLazySpanLookup = r0
            r0 = 2
            r2.mGapStrategy = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.mTmpRect = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$AnchorInfo r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$AnchorInfo
            r0.<init>(r2)
            r2.mAnchorInfo = r0
            r2.mLaidOutInvalidFullSpan = r1
            r0 = 1
            r2.mSmoothScrollbarEnabled = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$1 r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$1
            r0.<init>(r2)
            r2.mCheckForGapsRunnable = r0
            r2.mOrientation = r4
            r2.setSpanCount(r3)
            androidx.recyclerview.widget.LayoutState r3 = new androidx.recyclerview.widget.LayoutState
            r3.<init>()
            r2.mLayoutState = r3
            r2.createOrientationHelpers()
            return
    }

    public StaggeredGridLayoutManager(android.content.Context r3, android.util.AttributeSet r4, int r5, int r6) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.mSpanCount = r0
            r1 = 0
            r2.mReverseLayout = r1
            r2.mShouldReverseLayout = r1
            r2.mPendingScrollPosition = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.mPendingScrollPositionOffset = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup
            r0.<init>()
            r2.mLazySpanLookup = r0
            r0 = 2
            r2.mGapStrategy = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.mTmpRect = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$AnchorInfo r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$AnchorInfo
            r0.<init>(r2)
            r2.mAnchorInfo = r0
            r2.mLaidOutInvalidFullSpan = r1
            r0 = 1
            r2.mSmoothScrollbarEnabled = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$1 r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$1
            r0.<init>(r2)
            r2.mCheckForGapsRunnable = r0
            androidx.recyclerview.widget.RecyclerView$LayoutManager$Properties r3 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getProperties(r3, r4, r5, r6)
            int r4 = r3.orientation
            r2.setOrientation(r4)
            int r4 = r3.spanCount
            r2.setSpanCount(r4)
            boolean r3 = r3.reverseLayout
            r2.setReverseLayout(r3)
            androidx.recyclerview.widget.LayoutState r3 = new androidx.recyclerview.widget.LayoutState
            r3.<init>()
            r2.mLayoutState = r3
            r2.createOrientationHelpers()
            return
    }

    private void appendViewToAllSpans(android.view.View r3) {
            r2 = this;
            int r0 = r2.mSpanCount
            int r0 = r0 + (-1)
        L4:
            if (r0 < 0) goto L10
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r1 = r2.mSpans
            r1 = r1[r0]
            r1.appendToSpan(r3)
            int r0 = r0 + (-1)
            goto L4
        L10:
            return
    }

    private void applyPendingSavedState(androidx.recyclerview.widget.StaggeredGridLayoutManager.AnchorInfo r5) {
            r4 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = r4.mPendingSavedState
            int r1 = r0.mSpanOffsetsSize
            if (r1 <= 0) goto L46
            int r2 = r4.mSpanCount
            if (r1 != r2) goto L3d
            r0 = 0
        Lb:
            int r1 = r4.mSpanCount
            if (r0 >= r1) goto L46
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r1 = r4.mSpans
            r1 = r1[r0]
            r1.clear()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r4.mPendingSavedState
            int[] r2 = r1.mSpanOffsets
            r2 = r2[r0]
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r3) goto L33
            boolean r1 = r1.mAnchorLayoutFromEnd
            if (r1 == 0) goto L2c
            androidx.recyclerview.widget.OrientationHelper r1 = r4.mPrimaryOrientation
            int r1 = r1.getEndAfterPadding()
        L2a:
            int r2 = r2 + r1
            goto L33
        L2c:
            androidx.recyclerview.widget.OrientationHelper r1 = r4.mPrimaryOrientation
            int r1 = r1.getStartAfterPadding()
            goto L2a
        L33:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r1 = r4.mSpans
            r1 = r1[r0]
            r1.setLine(r2)
            int r0 = r0 + 1
            goto Lb
        L3d:
            r0.invalidateSpanInfo()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = r4.mPendingSavedState
            int r1 = r0.mVisibleAnchorPosition
            r0.mAnchorPosition = r1
        L46:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = r4.mPendingSavedState
            boolean r1 = r0.mLastLayoutRTL
            r4.mLastLayoutRTL = r1
            boolean r0 = r0.mReverseLayout
            r4.setReverseLayout(r0)
            r4.resolveShouldLayoutReverse()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = r4.mPendingSavedState
            int r1 = r0.mAnchorPosition
            r2 = -1
            if (r1 == r2) goto L62
            r4.mPendingScrollPosition = r1
            boolean r1 = r0.mAnchorLayoutFromEnd
            r5.mLayoutFromEnd = r1
            goto L66
        L62:
            boolean r1 = r4.mShouldReverseLayout
            r5.mLayoutFromEnd = r1
        L66:
            int r5 = r0.mSpanLookupSize
            r1 = 1
            if (r5 <= r1) goto L75
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r5 = r4.mLazySpanLookup
            int[] r1 = r0.mSpanLookup
            r5.mData = r1
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r0.mFullSpanItems
            r5.mFullSpanItems = r0
        L75:
            return
    }

    private void attachViewToSpans(android.view.View r2, androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams r3, androidx.recyclerview.widget.LayoutState r4) {
            r1 = this;
            int r4 = r4.mLayoutDirection
            r0 = 1
            if (r4 != r0) goto L13
            boolean r4 = r3.mFullSpan
            if (r4 == 0) goto Ld
            r1.appendViewToAllSpans(r2)
            return
        Ld:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r3 = r3.mSpan
            r3.appendToSpan(r2)
            return
        L13:
            boolean r4 = r3.mFullSpan
            if (r4 == 0) goto L1b
            r1.prependViewToAllSpans(r2)
            return
        L1b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r3 = r3.mSpan
            r3.prependToSpan(r2)
            return
    }

    private int calculateScrollDirectionForPosition(int r4) {
            r3 = this;
            int r0 = r3.getChildCount()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.mShouldReverseLayout
            if (r4 == 0) goto Ld
            return r2
        Ld:
            return r1
        Le:
            int r0 = r3.getFirstChildPosition()
            if (r4 >= r0) goto L16
            r4 = 1
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.mShouldReverseLayout
            if (r4 == r0) goto L1c
            return r1
        L1c:
            return r2
    }

    private boolean checkSpanForGap(androidx.recyclerview.widget.StaggeredGridLayoutManager.Span r4) {
            r3 = this;
            boolean r0 = r3.mShouldReverseLayout
            r1 = 0
            if (r0 == 0) goto L28
            int r0 = r4.getEndLine()
            androidx.recyclerview.widget.OrientationHelper r2 = r3.mPrimaryOrientation
            int r2 = r2.getEndAfterPadding()
            if (r0 >= r2) goto L43
            java.util.ArrayList<android.view.View> r0 = r4.mViews
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            android.view.View r0 = (android.view.View) r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r4 = r4.getLayoutParams(r0)
            boolean r4 = r4.mFullSpan
        L25:
            r4 = r4 ^ 1
            return r4
        L28:
            int r0 = r4.getStartLine()
            androidx.recyclerview.widget.OrientationHelper r2 = r3.mPrimaryOrientation
            int r2 = r2.getStartAfterPadding()
            if (r0 <= r2) goto L43
            java.util.ArrayList<android.view.View> r0 = r4.mViews
            java.lang.Object r0 = r0.get(r1)
            android.view.View r0 = (android.view.View) r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r4 = r4.getLayoutParams(r0)
            boolean r4 = r4.mFullSpan
            goto L25
        L43:
            return r1
    }

    private int computeScrollExtent(androidx.recyclerview.widget.RecyclerView.State r7) {
            r6 = this;
            int r0 = r6.getChildCount()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            androidx.recyclerview.widget.OrientationHelper r1 = r6.mPrimaryOrientation
            boolean r0 = r6.mSmoothScrollbarEnabled
            r0 = r0 ^ 1
            android.view.View r2 = r6.findFirstVisibleItemClosestToStart(r0)
            boolean r0 = r6.mSmoothScrollbarEnabled
            r0 = r0 ^ 1
            android.view.View r3 = r6.findFirstVisibleItemClosestToEnd(r0)
            boolean r5 = r6.mSmoothScrollbarEnabled
            r4 = r6
            r0 = r7
            int r7 = androidx.recyclerview.widget.ScrollbarHelper.computeScrollExtent(r0, r1, r2, r3, r4, r5)
            return r7
    }

    private int computeScrollOffset(androidx.recyclerview.widget.RecyclerView.State r8) {
            r7 = this;
            int r0 = r7.getChildCount()
            if (r0 != 0) goto L8
            r8 = 0
            return r8
        L8:
            androidx.recyclerview.widget.OrientationHelper r1 = r7.mPrimaryOrientation
            boolean r0 = r7.mSmoothScrollbarEnabled
            r0 = r0 ^ 1
            android.view.View r2 = r7.findFirstVisibleItemClosestToStart(r0)
            boolean r0 = r7.mSmoothScrollbarEnabled
            r0 = r0 ^ 1
            android.view.View r3 = r7.findFirstVisibleItemClosestToEnd(r0)
            boolean r5 = r7.mSmoothScrollbarEnabled
            boolean r6 = r7.mShouldReverseLayout
            r4 = r7
            r0 = r8
            int r8 = androidx.recyclerview.widget.ScrollbarHelper.computeScrollOffset(r0, r1, r2, r3, r4, r5, r6)
            return r8
    }

    private int computeScrollRange(androidx.recyclerview.widget.RecyclerView.State r7) {
            r6 = this;
            int r0 = r6.getChildCount()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            androidx.recyclerview.widget.OrientationHelper r1 = r6.mPrimaryOrientation
            boolean r0 = r6.mSmoothScrollbarEnabled
            r0 = r0 ^ 1
            android.view.View r2 = r6.findFirstVisibleItemClosestToStart(r0)
            boolean r0 = r6.mSmoothScrollbarEnabled
            r0 = r0 ^ 1
            android.view.View r3 = r6.findFirstVisibleItemClosestToEnd(r0)
            boolean r5 = r6.mSmoothScrollbarEnabled
            r4 = r6
            r0 = r7
            int r7 = androidx.recyclerview.widget.ScrollbarHelper.computeScrollRange(r0, r1, r2, r3, r4, r5)
            return r7
    }

    private int convertFocusDirectionToLayoutDirection(int r5) {
            r4 = this;
            r0 = -1
            r1 = 1
            if (r5 == r1) goto L3f
            r2 = 2
            if (r5 == r2) goto L32
            r2 = 17
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r2) goto L2c
            r2 = 33
            if (r5 == r2) goto L26
            r0 = 66
            if (r5 == r0) goto L20
            r0 = 130(0x82, float:1.82E-43)
            if (r5 == r0) goto L1a
            return r3
        L1a:
            int r5 = r4.mOrientation
            if (r5 != r1) goto L1f
            return r1
        L1f:
            return r3
        L20:
            int r5 = r4.mOrientation
            if (r5 != 0) goto L25
            return r1
        L25:
            return r3
        L26:
            int r5 = r4.mOrientation
            if (r5 != r1) goto L2b
            return r0
        L2b:
            return r3
        L2c:
            int r5 = r4.mOrientation
            if (r5 != 0) goto L31
            return r0
        L31:
            return r3
        L32:
            int r5 = r4.mOrientation
            if (r5 != r1) goto L37
            return r1
        L37:
            boolean r5 = r4.isLayoutRTL()
            if (r5 == 0) goto L3e
            return r0
        L3e:
            return r1
        L3f:
            int r5 = r4.mOrientation
            if (r5 != r1) goto L44
            return r0
        L44:
            boolean r5 = r4.isLayoutRTL()
            if (r5 == 0) goto L4b
            return r1
        L4b:
            return r0
    }

    private androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem createFullSpanItemFromEnd(int r5) {
            r4 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem
            r0.<init>()
            int r1 = r4.mSpanCount
            int[] r1 = new int[r1]
            r0.mGapPerSpan = r1
            r1 = 0
        Lc:
            int r2 = r4.mSpanCount
            if (r1 >= r2) goto L21
            int[] r2 = r0.mGapPerSpan
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r3 = r4.mSpans
            r3 = r3[r1]
            int r3 = r3.getEndLine(r5)
            int r3 = r5 - r3
            r2[r1] = r3
            int r1 = r1 + 1
            goto Lc
        L21:
            return r0
    }

    private androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem createFullSpanItemFromStart(int r5) {
            r4 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem
            r0.<init>()
            int r1 = r4.mSpanCount
            int[] r1 = new int[r1]
            r0.mGapPerSpan = r1
            r1 = 0
        Lc:
            int r2 = r4.mSpanCount
            if (r1 >= r2) goto L20
            int[] r2 = r0.mGapPerSpan
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r3 = r4.mSpans
            r3 = r3[r1]
            int r3 = r3.getStartLine(r5)
            int r3 = r3 - r5
            r2[r1] = r3
            int r1 = r1 + 1
            goto Lc
        L20:
            return r0
    }

    private void createOrientationHelpers() {
            r1 = this;
            int r0 = r1.mOrientation
            androidx.recyclerview.widget.OrientationHelper r0 = androidx.recyclerview.widget.OrientationHelper.createOrientationHelper(r1, r0)
            r1.mPrimaryOrientation = r0
            int r0 = r1.mOrientation
            int r0 = 1 - r0
            androidx.recyclerview.widget.OrientationHelper r0 = androidx.recyclerview.widget.OrientationHelper.createOrientationHelper(r1, r0)
            r1.mSecondaryOrientation = r0
            return
    }

    private int fill(androidx.recyclerview.widget.RecyclerView.Recycler r18, androidx.recyclerview.widget.LayoutState r19, androidx.recyclerview.widget.RecyclerView.State r20) {
            r17 = this;
            r0 = r17
            r6 = r18
            r7 = r19
            java.util.BitSet r1 = r0.mRemainingSpans
            int r2 = r0.mSpanCount
            r8 = 0
            r9 = 1
            r1.set(r8, r2, r9)
            androidx.recyclerview.widget.LayoutState r1 = r0.mLayoutState
            boolean r1 = r1.mInfinite
            if (r1 == 0) goto L25
            int r1 = r7.mLayoutDirection
            if (r1 != r9) goto L20
            r1 = 2147483647(0x7fffffff, float:NaN)
            r10 = 2147483647(0x7fffffff, float:NaN)
            goto L36
        L20:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L36
        L25:
            int r1 = r7.mLayoutDirection
            if (r1 != r9) goto L30
            int r1 = r7.mEndLine
            int r2 = r7.mAvailable
            int r1 = r1 + r2
        L2e:
            r10 = r1
            goto L36
        L30:
            int r1 = r7.mStartLine
            int r2 = r7.mAvailable
            int r1 = r1 - r2
            goto L2e
        L36:
            int r1 = r7.mLayoutDirection
            r0.updateAllRemainingSpans(r1, r10)
            boolean r1 = r0.mShouldReverseLayout
            if (r1 == 0) goto L47
            androidx.recyclerview.widget.OrientationHelper r1 = r0.mPrimaryOrientation
            int r1 = r1.getEndAfterPadding()
        L45:
            r11 = r1
            goto L4e
        L47:
            androidx.recyclerview.widget.OrientationHelper r1 = r0.mPrimaryOrientation
            int r1 = r1.getStartAfterPadding()
            goto L45
        L4e:
            r1 = 0
        L4f:
            boolean r2 = r19.hasMore(r20)
            r3 = -1
            if (r2 == 0) goto L1cc
            androidx.recyclerview.widget.LayoutState r2 = r0.mLayoutState
            boolean r2 = r2.mInfinite
            if (r2 != 0) goto L64
            java.util.BitSet r2 = r0.mRemainingSpans
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L1cc
        L64:
            android.view.View r1 = r7.next(r6)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            r12 = r2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r12 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r12
            int r2 = r12.getViewLayoutPosition()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r0.mLazySpanLookup
            int r4 = r4.getSpan(r2)
            if (r4 != r3) goto L7d
            r5 = 1
            goto L7e
        L7d:
            r5 = 0
        L7e:
            if (r5 == 0) goto L94
            boolean r4 = r12.mFullSpan
            if (r4 == 0) goto L89
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r4 = r0.mSpans
            r4 = r4[r8]
            goto L8d
        L89:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r4 = r0.getNextSpan(r7)
        L8d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r13 = r0.mLazySpanLookup
            r13.setSpan(r2, r4)
        L92:
            r13 = r4
            goto L99
        L94:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r13 = r0.mSpans
            r4 = r13[r4]
            goto L92
        L99:
            r12.mSpan = r13
            int r4 = r7.mLayoutDirection
            if (r4 != r9) goto La3
            r0.addView(r1)
            goto La6
        La3:
            r0.addView(r1, r8)
        La6:
            r0.measureChildWithDecorationsAndMargin(r1, r12, r8)
            int r4 = r7.mLayoutDirection
            if (r4 != r9) goto Ld5
            boolean r4 = r12.mFullSpan
            if (r4 == 0) goto Lb6
            int r4 = r0.getMaxEnd(r11)
            goto Lba
        Lb6:
            int r4 = r13.getEndLine(r11)
        Lba:
            androidx.recyclerview.widget.OrientationHelper r14 = r0.mPrimaryOrientation
            int r14 = r14.getDecoratedMeasurement(r1)
            int r14 = r14 + r4
            if (r5 == 0) goto Lff
            boolean r15 = r12.mFullSpan
            if (r15 == 0) goto Lff
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r15 = r0.createFullSpanItemFromEnd(r4)
            r15.mGapDir = r3
            r15.mPosition = r2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r8 = r0.mLazySpanLookup
            r8.addFullSpanItem(r15)
            goto Lff
        Ld5:
            boolean r4 = r12.mFullSpan
            if (r4 == 0) goto Ldf
            int r4 = r0.getMinStart(r11)
        Ldd:
            r14 = r4
            goto Le4
        Ldf:
            int r4 = r13.getStartLine(r11)
            goto Ldd
        Le4:
            androidx.recyclerview.widget.OrientationHelper r4 = r0.mPrimaryOrientation
            int r4 = r4.getDecoratedMeasurement(r1)
            int r4 = r14 - r4
            if (r5 == 0) goto Lff
            boolean r8 = r12.mFullSpan
            if (r8 == 0) goto Lff
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r8 = r0.createFullSpanItemFromStart(r14)
            r8.mGapDir = r9
            r8.mPosition = r2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r15 = r0.mLazySpanLookup
            r15.addFullSpanItem(r8)
        Lff:
            boolean r8 = r12.mFullSpan
            if (r8 == 0) goto L129
            int r8 = r7.mItemDirection
            if (r8 != r3) goto L129
            if (r5 == 0) goto L10c
            r0.mLaidOutInvalidFullSpan = r9
            goto L129
        L10c:
            int r3 = r7.mLayoutDirection
            if (r3 != r9) goto L116
            boolean r3 = r0.areAllEndsEqual()
        L114:
            r3 = r3 ^ r9
            goto L11b
        L116:
            boolean r3 = r0.areAllStartsEqual()
            goto L114
        L11b:
            if (r3 == 0) goto L129
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r3 = r0.mLazySpanLookup
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r2 = r3.getFullSpanItem(r2)
            if (r2 == 0) goto L127
            r2.mHasUnwantedGapAfter = r9
        L127:
            r0.mLaidOutInvalidFullSpan = r9
        L129:
            r0.attachViewToSpans(r1, r12, r7)
            boolean r2 = r0.isLayoutRTL()
            if (r2 == 0) goto L15d
            int r2 = r0.mOrientation
            if (r2 != r9) goto L15d
            boolean r2 = r12.mFullSpan
            if (r2 == 0) goto L141
            androidx.recyclerview.widget.OrientationHelper r2 = r0.mSecondaryOrientation
            int r2 = r2.getEndAfterPadding()
            goto L152
        L141:
            androidx.recyclerview.widget.OrientationHelper r2 = r0.mSecondaryOrientation
            int r2 = r2.getEndAfterPadding()
            int r3 = r0.mSpanCount
            int r3 = r3 - r9
            int r5 = r13.mIndex
            int r3 = r3 - r5
            int r5 = r0.mSizePerSpan
            int r3 = r3 * r5
            int r2 = r2 - r3
        L152:
            androidx.recyclerview.widget.OrientationHelper r3 = r0.mSecondaryOrientation
            int r3 = r3.getDecoratedMeasurement(r1)
            int r3 = r2 - r3
        L15a:
            r5 = r2
            r2 = r3
            goto L17f
        L15d:
            boolean r2 = r12.mFullSpan
            if (r2 == 0) goto L169
            androidx.recyclerview.widget.OrientationHelper r2 = r0.mSecondaryOrientation
            int r2 = r2.getStartAfterPadding()
        L167:
            r3 = r2
            goto L177
        L169:
            int r2 = r13.mIndex
            int r3 = r0.mSizePerSpan
            int r2 = r2 * r3
            androidx.recyclerview.widget.OrientationHelper r3 = r0.mSecondaryOrientation
            int r3 = r3.getStartAfterPadding()
            int r2 = r2 + r3
            goto L167
        L177:
            androidx.recyclerview.widget.OrientationHelper r2 = r0.mSecondaryOrientation
            int r2 = r2.getDecoratedMeasurement(r1)
            int r2 = r2 + r3
            goto L15a
        L17f:
            int r3 = r0.mOrientation
            if (r3 != r9) goto L18c
            r3 = r4
            r4 = r5
            r5 = r14
            r0.layoutDecoratedWithMargins(r1, r2, r3, r4, r5)
            r0 = r17
            goto L192
        L18c:
            r3 = r2
            r2 = r4
            r4 = r14
            r0.layoutDecoratedWithMargins(r1, r2, r3, r4, r5)
        L192:
            boolean r2 = r12.mFullSpan
            if (r2 == 0) goto L19e
            androidx.recyclerview.widget.LayoutState r2 = r0.mLayoutState
            int r2 = r2.mLayoutDirection
            r0.updateAllRemainingSpans(r2, r10)
            goto L1a5
        L19e:
            androidx.recyclerview.widget.LayoutState r2 = r0.mLayoutState
            int r2 = r2.mLayoutDirection
            r0.updateRemainingSpans(r13, r2, r10)
        L1a5:
            androidx.recyclerview.widget.LayoutState r2 = r0.mLayoutState
            r0.recycle(r6, r2)
            androidx.recyclerview.widget.LayoutState r2 = r0.mLayoutState
            boolean r2 = r2.mStopInFocusable
            if (r2 == 0) goto L1c8
            boolean r1 = r1.hasFocusable()
            if (r1 == 0) goto L1c8
            boolean r1 = r12.mFullSpan
            if (r1 == 0) goto L1c0
            java.util.BitSet r1 = r0.mRemainingSpans
            r1.clear()
            goto L1c8
        L1c0:
            java.util.BitSet r1 = r0.mRemainingSpans
            int r2 = r13.mIndex
            r3 = 0
            r1.set(r2, r3)
        L1c8:
            r1 = 1
            r8 = 0
            goto L4f
        L1cc:
            if (r1 != 0) goto L1d3
            androidx.recyclerview.widget.LayoutState r1 = r0.mLayoutState
            r0.recycle(r6, r1)
        L1d3:
            androidx.recyclerview.widget.LayoutState r1 = r0.mLayoutState
            int r1 = r1.mLayoutDirection
            if (r1 != r3) goto L1eb
            androidx.recyclerview.widget.OrientationHelper r1 = r0.mPrimaryOrientation
            int r1 = r1.getStartAfterPadding()
            int r1 = r0.getMinStart(r1)
            androidx.recyclerview.widget.OrientationHelper r2 = r0.mPrimaryOrientation
            int r2 = r2.getStartAfterPadding()
            int r2 = r2 - r1
            goto L1fd
        L1eb:
            androidx.recyclerview.widget.OrientationHelper r1 = r0.mPrimaryOrientation
            int r1 = r1.getEndAfterPadding()
            int r1 = r0.getMaxEnd(r1)
            androidx.recyclerview.widget.OrientationHelper r2 = r0.mPrimaryOrientation
            int r2 = r2.getEndAfterPadding()
            int r2 = r1 - r2
        L1fd:
            if (r2 <= 0) goto L206
            int r1 = r7.mAvailable
            int r1 = java.lang.Math.min(r1, r2)
            return r1
        L206:
            r16 = 0
            return r16
    }

    private int findFirstReferenceChildPosition(int r5) {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L18
            android.view.View r3 = r4.getChildAt(r2)
            int r3 = r4.getPosition(r3)
            if (r3 < 0) goto L15
            if (r3 >= r5) goto L15
            return r3
        L15:
            int r2 = r2 + 1
            goto L6
        L18:
            return r1
    }

    private int findLastReferenceChildPosition(int r3) {
            r2 = this;
            int r0 = r2.getChildCount()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L18
            android.view.View r1 = r2.getChildAt(r0)
            int r1 = r2.getPosition(r1)
            if (r1 < 0) goto L15
            if (r1 >= r3) goto L15
            return r1
        L15:
            int r0 = r0 + (-1)
            goto L6
        L18:
            r3 = 0
            return r3
    }

    private void fixEndGap(androidx.recyclerview.widget.RecyclerView.Recycler r3, androidx.recyclerview.widget.RecyclerView.State r4, boolean r5) {
            r2 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r2.getMaxEnd(r0)
            if (r1 != r0) goto L9
            goto L22
        L9:
            androidx.recyclerview.widget.OrientationHelper r0 = r2.mPrimaryOrientation
            int r0 = r0.getEndAfterPadding()
            int r0 = r0 - r1
            if (r0 <= 0) goto L22
            int r1 = -r0
            int r3 = r2.scrollBy(r1, r3, r4)
            int r3 = -r3
            int r0 = r0 - r3
            if (r5 == 0) goto L22
            if (r0 <= 0) goto L22
            androidx.recyclerview.widget.OrientationHelper r3 = r2.mPrimaryOrientation
            r3.offsetChildren(r0)
        L22:
            return
    }

    private void fixStartGap(androidx.recyclerview.widget.RecyclerView.Recycler r3, androidx.recyclerview.widget.RecyclerView.State r4, boolean r5) {
            r2 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = r2.getMinStart(r0)
            if (r1 != r0) goto La
            goto L22
        La:
            androidx.recyclerview.widget.OrientationHelper r0 = r2.mPrimaryOrientation
            int r0 = r0.getStartAfterPadding()
            int r1 = r1 - r0
            if (r1 <= 0) goto L22
            int r3 = r2.scrollBy(r1, r3, r4)
            int r1 = r1 - r3
            if (r5 == 0) goto L22
            if (r1 <= 0) goto L22
            androidx.recyclerview.widget.OrientationHelper r3 = r2.mPrimaryOrientation
            int r4 = -r1
            r3.offsetChildren(r4)
        L22:
            return
    }

    private int getMaxEnd(int r4) {
            r3 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r0 = r3.mSpans
            r1 = 0
            r0 = r0[r1]
            int r0 = r0.getEndLine(r4)
            r1 = 1
        La:
            int r2 = r3.mSpanCount
            if (r1 >= r2) goto L1c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r2 = r3.mSpans
            r2 = r2[r1]
            int r2 = r2.getEndLine(r4)
            if (r2 <= r0) goto L19
            r0 = r2
        L19:
            int r1 = r1 + 1
            goto La
        L1c:
            return r0
    }

    private int getMaxStart(int r4) {
            r3 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r0 = r3.mSpans
            r1 = 0
            r0 = r0[r1]
            int r0 = r0.getStartLine(r4)
            r1 = 1
        La:
            int r2 = r3.mSpanCount
            if (r1 >= r2) goto L1c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r2 = r3.mSpans
            r2 = r2[r1]
            int r2 = r2.getStartLine(r4)
            if (r2 <= r0) goto L19
            r0 = r2
        L19:
            int r1 = r1 + 1
            goto La
        L1c:
            return r0
    }

    private int getMinEnd(int r4) {
            r3 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r0 = r3.mSpans
            r1 = 0
            r0 = r0[r1]
            int r0 = r0.getEndLine(r4)
            r1 = 1
        La:
            int r2 = r3.mSpanCount
            if (r1 >= r2) goto L1c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r2 = r3.mSpans
            r2 = r2[r1]
            int r2 = r2.getEndLine(r4)
            if (r2 >= r0) goto L19
            r0 = r2
        L19:
            int r1 = r1 + 1
            goto La
        L1c:
            return r0
    }

    private int getMinStart(int r4) {
            r3 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r0 = r3.mSpans
            r1 = 0
            r0 = r0[r1]
            int r0 = r0.getStartLine(r4)
            r1 = 1
        La:
            int r2 = r3.mSpanCount
            if (r1 >= r2) goto L1c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r2 = r3.mSpans
            r2 = r2[r1]
            int r2 = r2.getStartLine(r4)
            if (r2 >= r0) goto L19
            r0 = r2
        L19:
            int r1 = r1 + 1
            goto La
        L1c:
            return r0
    }

    private androidx.recyclerview.widget.StaggeredGridLayoutManager.Span getNextSpan(androidx.recyclerview.widget.LayoutState r8) {
            r7 = this;
            int r0 = r8.mLayoutDirection
            boolean r0 = r7.preferLastSpan(r0)
            r1 = 1
            if (r0 == 0) goto Lf
            int r0 = r7.mSpanCount
            int r0 = r0 - r1
            r2 = -1
            r3 = -1
            goto L13
        Lf:
            int r2 = r7.mSpanCount
            r0 = 0
            r3 = 1
        L13:
            int r8 = r8.mLayoutDirection
            r4 = 0
            if (r8 != r1) goto L32
            androidx.recyclerview.widget.OrientationHelper r8 = r7.mPrimaryOrientation
            int r8 = r8.getStartAfterPadding()
            r1 = 2147483647(0x7fffffff, float:NaN)
        L21:
            if (r0 == r2) goto L31
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r5 = r7.mSpans
            r5 = r5[r0]
            int r6 = r5.getEndLine(r8)
            if (r6 >= r1) goto L2f
            r4 = r5
            r1 = r6
        L2f:
            int r0 = r0 + r3
            goto L21
        L31:
            return r4
        L32:
            androidx.recyclerview.widget.OrientationHelper r8 = r7.mPrimaryOrientation
            int r8 = r8.getEndAfterPadding()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L3a:
            if (r0 == r2) goto L4a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r5 = r7.mSpans
            r5 = r5[r0]
            int r6 = r5.getStartLine(r8)
            if (r6 <= r1) goto L48
            r4 = r5
            r1 = r6
        L48:
            int r0 = r0 + r3
            goto L3a
        L4a:
            return r4
    }

    private void handleUpdate(int r7, int r8, int r9) {
            r6 = this;
            boolean r0 = r6.mShouldReverseLayout
            if (r0 == 0) goto L9
            int r0 = r6.getLastChildPosition()
            goto Ld
        L9:
            int r0 = r6.getFirstChildPosition()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1b
            if (r7 >= r8) goto L17
            int r2 = r8 + 1
        L15:
            r3 = r7
            goto L1e
        L17:
            int r2 = r7 + 1
            r3 = r8
            goto L1e
        L1b:
            int r2 = r7 + r8
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.mLazySpanLookup
            r4.invalidateAfter(r3)
            r4 = 1
            if (r9 == r4) goto L3d
            r5 = 2
            if (r9 == r5) goto L37
            if (r9 == r1) goto L2c
            goto L42
        L2c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.mLazySpanLookup
            r9.offsetForRemoval(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.mLazySpanLookup
            r7.offsetForAddition(r8, r4)
            goto L42
        L37:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.mLazySpanLookup
            r9.offsetForRemoval(r7, r8)
            goto L42
        L3d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.mLazySpanLookup
            r9.offsetForAddition(r7, r8)
        L42:
            if (r2 > r0) goto L45
            goto L57
        L45:
            boolean r7 = r6.mShouldReverseLayout
            if (r7 == 0) goto L4e
            int r7 = r6.getFirstChildPosition()
            goto L52
        L4e:
            int r7 = r6.getLastChildPosition()
        L52:
            if (r3 > r7) goto L57
            r6.requestLayout()
        L57:
            return
    }

    private void measureChildWithDecorationsAndMargin(android.view.View r5, int r6, int r7, boolean r8) {
            r4 = this;
            android.graphics.Rect r0 = r4.mTmpRect
            r4.calculateItemDecorationsForChild(r5, r0)
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r0
            int r1 = r0.leftMargin
            android.graphics.Rect r2 = r4.mTmpRect
            int r3 = r2.left
            int r1 = r1 + r3
            int r3 = r0.rightMargin
            int r2 = r2.right
            int r3 = r3 + r2
            int r6 = r4.updateSpecWithExtra(r6, r1, r3)
            int r1 = r0.topMargin
            android.graphics.Rect r2 = r4.mTmpRect
            int r3 = r2.top
            int r1 = r1 + r3
            int r3 = r0.bottomMargin
            int r2 = r2.bottom
            int r3 = r3 + r2
            int r7 = r4.updateSpecWithExtra(r7, r1, r3)
            if (r8 == 0) goto L32
            boolean r8 = r4.shouldReMeasureChild(r5, r6, r7, r0)
            goto L36
        L32:
            boolean r8 = r4.shouldMeasureChild(r5, r6, r7, r0)
        L36:
            if (r8 == 0) goto L3b
            r5.measure(r6, r7)
        L3b:
            return
    }

    private void measureChildWithDecorationsAndMargin(android.view.View r7, androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams r8, boolean r9) {
            r6 = this;
            boolean r0 = r8.mFullSpan
            r1 = 1
            if (r0 == 0) goto L43
            int r0 = r6.mOrientation
            if (r0 != r1) goto L26
            int r0 = r6.mFullSizeSpec
            int r2 = r6.getHeight()
            int r3 = r6.getHeightMode()
            int r4 = r6.getPaddingTop()
            int r5 = r6.getPaddingBottom()
            int r4 = r4 + r5
            int r8 = r8.height
            int r8 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(r2, r3, r4, r8, r1)
            r6.measureChildWithDecorationsAndMargin(r7, r0, r8, r9)
            return
        L26:
            int r0 = r6.getWidth()
            int r2 = r6.getWidthMode()
            int r3 = r6.getPaddingLeft()
            int r4 = r6.getPaddingRight()
            int r3 = r3 + r4
            int r8 = r8.width
            int r8 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(r0, r2, r3, r8, r1)
            int r0 = r6.mFullSizeSpec
            r6.measureChildWithDecorationsAndMargin(r7, r8, r0, r9)
            return
        L43:
            int r0 = r6.mOrientation
            r2 = 0
            if (r0 != r1) goto L6f
            int r0 = r6.mSizePerSpan
            int r3 = r6.getWidthMode()
            int r4 = r8.width
            int r0 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(r0, r3, r2, r4, r2)
            int r2 = r6.getHeight()
            int r3 = r6.getHeightMode()
            int r4 = r6.getPaddingTop()
            int r5 = r6.getPaddingBottom()
            int r4 = r4 + r5
            int r8 = r8.height
            int r8 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(r2, r3, r4, r8, r1)
            r6.measureChildWithDecorationsAndMargin(r7, r0, r8, r9)
            return
        L6f:
            int r0 = r6.getWidth()
            int r3 = r6.getWidthMode()
            int r4 = r6.getPaddingLeft()
            int r5 = r6.getPaddingRight()
            int r4 = r4 + r5
            int r5 = r8.width
            int r0 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(r0, r3, r4, r5, r1)
            int r1 = r6.mSizePerSpan
            int r3 = r6.getHeightMode()
            int r8 = r8.height
            int r8 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(r1, r3, r2, r8, r2)
            r6.measureChildWithDecorationsAndMargin(r7, r0, r8, r9)
            return
    }

    private void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler r9, androidx.recyclerview.widget.RecyclerView.State r10, boolean r11) {
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$AnchorInfo r0 = r8.mAnchorInfo
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r8.mPendingSavedState
            r2 = -1
            if (r1 != 0) goto Lb
            int r1 = r8.mPendingScrollPosition
            if (r1 == r2) goto L18
        Lb:
            int r1 = r10.getItemCount()
            if (r1 != 0) goto L18
            r8.removeAndRecycleAllViews(r9)
            r0.reset()
            return
        L18:
            boolean r1 = r0.mValid
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L29
            int r1 = r8.mPendingScrollPosition
            if (r1 != r2) goto L29
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r8.mPendingSavedState
            if (r1 == 0) goto L27
            goto L29
        L27:
            r1 = 0
            goto L2a
        L29:
            r1 = 1
        L2a:
            if (r1 == 0) goto L43
            r0.reset()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.mPendingSavedState
            if (r5 == 0) goto L37
            r8.applyPendingSavedState(r0)
            goto L3e
        L37:
            r8.resolveShouldLayoutReverse()
            boolean r5 = r8.mShouldReverseLayout
            r0.mLayoutFromEnd = r5
        L3e:
            r8.updateAnchorInfoForLayout(r10, r0)
            r0.mValid = r4
        L43:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.mPendingSavedState
            if (r5 != 0) goto L60
            int r5 = r8.mPendingScrollPosition
            if (r5 != r2) goto L60
            boolean r5 = r0.mLayoutFromEnd
            boolean r6 = r8.mLastLayoutFromEnd
            if (r5 != r6) goto L59
            boolean r5 = r8.isLayoutRTL()
            boolean r6 = r8.mLastLayoutRTL
            if (r5 == r6) goto L60
        L59:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r5 = r8.mLazySpanLookup
            r5.clear()
            r0.mInvalidateOffsets = r4
        L60:
            int r5 = r8.getChildCount()
            if (r5 <= 0) goto Lc9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.mPendingSavedState
            if (r5 == 0) goto L6e
            int r5 = r5.mSpanOffsetsSize
            if (r5 >= r4) goto Lc9
        L6e:
            boolean r5 = r0.mInvalidateOffsets
            if (r5 == 0) goto L8e
            r1 = 0
        L73:
            int r5 = r8.mSpanCount
            if (r1 >= r5) goto Lc9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r5 = r8.mSpans
            r5 = r5[r1]
            r5.clear()
            int r5 = r0.mOffset
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L8b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r6 = r8.mSpans
            r6 = r6[r1]
            r6.setLine(r5)
        L8b:
            int r1 = r1 + 1
            goto L73
        L8e:
            if (r1 != 0) goto Laf
            androidx.recyclerview.widget.StaggeredGridLayoutManager$AnchorInfo r1 = r8.mAnchorInfo
            int[] r1 = r1.mSpanReferenceLines
            if (r1 != 0) goto L97
            goto Laf
        L97:
            r1 = 0
        L98:
            int r5 = r8.mSpanCount
            if (r1 >= r5) goto Lc9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r5 = r8.mSpans
            r5 = r5[r1]
            r5.clear()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$AnchorInfo r6 = r8.mAnchorInfo
            int[] r6 = r6.mSpanReferenceLines
            r6 = r6[r1]
            r5.setLine(r6)
            int r1 = r1 + 1
            goto L98
        Laf:
            r1 = 0
        Lb0:
            int r5 = r8.mSpanCount
            if (r1 >= r5) goto Lc2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r5 = r8.mSpans
            r5 = r5[r1]
            boolean r6 = r8.mShouldReverseLayout
            int r7 = r0.mOffset
            r5.cacheReferenceLineAndClear(r6, r7)
            int r1 = r1 + 1
            goto Lb0
        Lc2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$AnchorInfo r1 = r8.mAnchorInfo
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r5 = r8.mSpans
            r1.saveSpanReferenceLines(r5)
        Lc9:
            r8.detachAndScrapAttachedViews(r9)
            androidx.recyclerview.widget.LayoutState r1 = r8.mLayoutState
            r1.mRecycle = r3
            r8.mLaidOutInvalidFullSpan = r3
            androidx.recyclerview.widget.OrientationHelper r1 = r8.mSecondaryOrientation
            int r1 = r1.getTotalSpace()
            r8.updateMeasureSpecs(r1)
            int r1 = r0.mPosition
            r8.updateLayoutState(r1, r10)
            boolean r1 = r0.mLayoutFromEnd
            if (r1 == 0) goto Lfc
            r8.setLayoutStateDirection(r2)
            androidx.recyclerview.widget.LayoutState r1 = r8.mLayoutState
            r8.fill(r9, r1, r10)
            r8.setLayoutStateDirection(r4)
            androidx.recyclerview.widget.LayoutState r1 = r8.mLayoutState
            int r2 = r0.mPosition
            int r5 = r1.mItemDirection
            int r2 = r2 + r5
            r1.mCurrentPosition = r2
            r8.fill(r9, r1, r10)
            goto L113
        Lfc:
            r8.setLayoutStateDirection(r4)
            androidx.recyclerview.widget.LayoutState r1 = r8.mLayoutState
            r8.fill(r9, r1, r10)
            r8.setLayoutStateDirection(r2)
            androidx.recyclerview.widget.LayoutState r1 = r8.mLayoutState
            int r2 = r0.mPosition
            int r5 = r1.mItemDirection
            int r2 = r2 + r5
            r1.mCurrentPosition = r2
            r8.fill(r9, r1, r10)
        L113:
            r8.repositionToWrapContentIfNecessary()
            int r1 = r8.getChildCount()
            if (r1 <= 0) goto L12d
            boolean r1 = r8.mShouldReverseLayout
            if (r1 == 0) goto L127
            r8.fixEndGap(r9, r10, r4)
            r8.fixStartGap(r9, r10, r3)
            goto L12d
        L127:
            r8.fixStartGap(r9, r10, r4)
            r8.fixEndGap(r9, r10, r3)
        L12d:
            if (r11 == 0) goto L155
            boolean r11 = r10.isPreLayout()
            if (r11 != 0) goto L155
            int r11 = r8.mGapStrategy
            if (r11 == 0) goto L155
            int r11 = r8.getChildCount()
            if (r11 <= 0) goto L155
            boolean r11 = r8.mLaidOutInvalidFullSpan
            if (r11 != 0) goto L149
            android.view.View r11 = r8.hasGapsToFix()
            if (r11 == 0) goto L155
        L149:
            java.lang.Runnable r11 = r8.mCheckForGapsRunnable
            r8.removeCallbacks(r11)
            boolean r11 = r8.checkForGaps()
            if (r11 == 0) goto L155
            goto L156
        L155:
            r4 = 0
        L156:
            boolean r11 = r10.isPreLayout()
            if (r11 == 0) goto L161
            androidx.recyclerview.widget.StaggeredGridLayoutManager$AnchorInfo r11 = r8.mAnchorInfo
            r11.reset()
        L161:
            boolean r11 = r0.mLayoutFromEnd
            r8.mLastLayoutFromEnd = r11
            boolean r11 = r8.isLayoutRTL()
            r8.mLastLayoutRTL = r11
            if (r4 == 0) goto L175
            androidx.recyclerview.widget.StaggeredGridLayoutManager$AnchorInfo r11 = r8.mAnchorInfo
            r11.reset()
            r8.onLayoutChildren(r9, r10, r3)
        L175:
            return
    }

    private boolean preferLastSpan(int r5) {
            r4 = this;
            int r0 = r4.mOrientation
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L12
            if (r5 != r1) goto Lb
            r5 = 1
            goto Lc
        Lb:
            r5 = 0
        Lc:
            boolean r0 = r4.mShouldReverseLayout
            if (r5 == r0) goto L11
            return r3
        L11:
            return r2
        L12:
            if (r5 != r1) goto L16
            r5 = 1
            goto L17
        L16:
            r5 = 0
        L17:
            boolean r0 = r4.mShouldReverseLayout
            if (r5 != r0) goto L1d
            r5 = 1
            goto L1e
        L1d:
            r5 = 0
        L1e:
            boolean r0 = r4.isLayoutRTL()
            if (r5 != r0) goto L25
            return r3
        L25:
            return r2
    }

    private void prependViewToAllSpans(android.view.View r3) {
            r2 = this;
            int r0 = r2.mSpanCount
            int r0 = r0 + (-1)
        L4:
            if (r0 < 0) goto L10
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r1 = r2.mSpans
            r1 = r1[r0]
            r1.prependToSpan(r3)
            int r0 = r0 + (-1)
            goto L4
        L10:
            return
    }

    private void recycle(androidx.recyclerview.widget.RecyclerView.Recycler r3, androidx.recyclerview.widget.LayoutState r4) {
            r2 = this;
            boolean r0 = r4.mRecycle
            if (r0 == 0) goto L56
            boolean r0 = r4.mInfinite
            if (r0 == 0) goto L9
            goto L56
        L9:
            int r0 = r4.mAvailable
            r1 = -1
            if (r0 != 0) goto L1e
            int r0 = r4.mLayoutDirection
            if (r0 != r1) goto L18
            int r4 = r4.mEndLine
            r2.recycleFromEnd(r3, r4)
            return
        L18:
            int r4 = r4.mStartLine
            r2.recycleFromStart(r3, r4)
            return
        L1e:
            int r0 = r4.mLayoutDirection
            if (r0 != r1) goto L3c
            int r0 = r4.mStartLine
            int r1 = r2.getMaxStart(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L2e
            int r4 = r4.mEndLine
            goto L38
        L2e:
            int r1 = r4.mEndLine
            int r4 = r4.mAvailable
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
        L38:
            r2.recycleFromEnd(r3, r4)
            return
        L3c:
            int r0 = r4.mEndLine
            int r0 = r2.getMinEnd(r0)
            int r1 = r4.mEndLine
            int r0 = r0 - r1
            if (r0 >= 0) goto L4a
            int r4 = r4.mStartLine
            goto L53
        L4a:
            int r1 = r4.mStartLine
            int r4 = r4.mAvailable
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
        L53:
            r2.recycleFromStart(r3, r4)
        L56:
            return
    }

    private void recycleFromEnd(androidx.recyclerview.widget.RecyclerView.Recycler r7, int r8) {
            r6 = this;
            int r0 = r6.getChildCount()
            r1 = 1
            int r0 = r0 - r1
        L6:
            if (r0 < 0) goto L60
            android.view.View r2 = r6.getChildAt(r0)
            androidx.recyclerview.widget.OrientationHelper r3 = r6.mPrimaryOrientation
            int r3 = r3.getDecoratedStart(r2)
            if (r3 < r8) goto L60
            androidx.recyclerview.widget.OrientationHelper r3 = r6.mPrimaryOrientation
            int r3 = r3.getTransformedStartWithDecoration(r2)
            if (r3 < r8) goto L60
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r3
            boolean r4 = r3.mFullSpan
            if (r4 == 0) goto L4a
            r3 = 0
            r4 = 0
        L28:
            int r5 = r6.mSpanCount
            if (r4 >= r5) goto L3c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r5 = r6.mSpans
            r5 = r5[r4]
            java.util.ArrayList<android.view.View> r5 = r5.mViews
            int r5 = r5.size()
            if (r5 != r1) goto L39
            goto L60
        L39:
            int r4 = r4 + 1
            goto L28
        L3c:
            int r4 = r6.mSpanCount
            if (r3 >= r4) goto L5a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r4 = r6.mSpans
            r4 = r4[r3]
            r4.popEnd()
            int r3 = r3 + 1
            goto L3c
        L4a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r4 = r3.mSpan
            java.util.ArrayList<android.view.View> r4 = r4.mViews
            int r4 = r4.size()
            if (r4 != r1) goto L55
            goto L60
        L55:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r3 = r3.mSpan
            r3.popEnd()
        L5a:
            r6.removeAndRecycleView(r2, r7)
            int r0 = r0 + (-1)
            goto L6
        L60:
            return
    }

    private void recycleFromStart(androidx.recyclerview.widget.RecyclerView.Recycler r6, int r7) {
            r5 = this;
        L0:
            int r0 = r5.getChildCount()
            if (r0 <= 0) goto L5d
            r0 = 0
            android.view.View r1 = r5.getChildAt(r0)
            androidx.recyclerview.widget.OrientationHelper r2 = r5.mPrimaryOrientation
            int r2 = r2.getDecoratedEnd(r1)
            if (r2 > r7) goto L5d
            androidx.recyclerview.widget.OrientationHelper r2 = r5.mPrimaryOrientation
            int r2 = r2.getTransformedEndWithDecoration(r1)
            if (r2 > r7) goto L5d
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r2
            boolean r3 = r2.mFullSpan
            r4 = 1
            if (r3 == 0) goto L49
            r2 = 0
        L27:
            int r3 = r5.mSpanCount
            if (r2 >= r3) goto L3b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r3 = r5.mSpans
            r3 = r3[r2]
            java.util.ArrayList<android.view.View> r3 = r3.mViews
            int r3 = r3.size()
            if (r3 != r4) goto L38
            goto L5d
        L38:
            int r2 = r2 + 1
            goto L27
        L3b:
            int r2 = r5.mSpanCount
            if (r0 >= r2) goto L59
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r2 = r5.mSpans
            r2 = r2[r0]
            r2.popStart()
            int r0 = r0 + 1
            goto L3b
        L49:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r0 = r2.mSpan
            java.util.ArrayList<android.view.View> r0 = r0.mViews
            int r0 = r0.size()
            if (r0 != r4) goto L54
            goto L5d
        L54:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r0 = r2.mSpan
            r0.popStart()
        L59:
            r5.removeAndRecycleView(r1, r6)
            goto L0
        L5d:
            return
    }

    private void repositionToWrapContentIfNecessary() {
            r9 = this;
            androidx.recyclerview.widget.OrientationHelper r0 = r9.mSecondaryOrientation
            int r0 = r0.getMode()
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto Lc
            goto Lb5
        Lc:
            int r0 = r9.getChildCount()
            r1 = 0
            r2 = 0
            r3 = 0
        L13:
            if (r3 >= r0) goto L40
            android.view.View r4 = r9.getChildAt(r3)
            androidx.recyclerview.widget.OrientationHelper r5 = r9.mSecondaryOrientation
            int r5 = r5.getDecoratedMeasurement(r4)
            float r5 = (float) r5
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 >= 0) goto L25
            goto L3d
        L25:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r4 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r4
            boolean r4 = r4.isFullSpan()
            if (r4 == 0) goto L39
            r4 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 * r4
            int r4 = r9.mSpanCount
            float r4 = (float) r4
            float r5 = r5 / r4
        L39:
            float r2 = java.lang.Math.max(r2, r5)
        L3d:
            int r3 = r3 + 1
            goto L13
        L40:
            int r3 = r9.mSizePerSpan
            int r4 = r9.mSpanCount
            float r4 = (float) r4
            float r2 = r2 * r4
            int r2 = java.lang.Math.round(r2)
            androidx.recyclerview.widget.OrientationHelper r4 = r9.mSecondaryOrientation
            int r4 = r4.getMode()
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r5) goto L5f
            androidx.recyclerview.widget.OrientationHelper r4 = r9.mSecondaryOrientation
            int r4 = r4.getTotalSpace()
            int r2 = java.lang.Math.min(r2, r4)
        L5f:
            r9.updateMeasureSpecs(r2)
            int r2 = r9.mSizePerSpan
            if (r2 != r3) goto L67
            goto Lb5
        L67:
            if (r1 >= r0) goto Lb5
            android.view.View r2 = r9.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r4 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r4
            boolean r5 = r4.mFullSpan
            if (r5 == 0) goto L78
            goto Lb2
        L78:
            boolean r5 = r9.isLayoutRTL()
            r6 = 1
            if (r5 == 0) goto L9b
            int r5 = r9.mOrientation
            if (r5 != r6) goto L9b
            int r5 = r9.mSpanCount
            int r7 = r5 + (-1)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r4 = r4.mSpan
            int r4 = r4.mIndex
            int r7 = r7 - r4
            int r7 = -r7
            int r8 = r9.mSizePerSpan
            int r7 = r7 * r8
            int r5 = r5 - r6
            int r5 = r5 - r4
            int r4 = -r5
            int r4 = r4 * r3
            int r7 = r7 - r4
            r2.offsetLeftAndRight(r7)
            goto Lb2
        L9b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r4 = r4.mSpan
            int r4 = r4.mIndex
            int r5 = r9.mSizePerSpan
            int r5 = r5 * r4
            int r4 = r4 * r3
            int r7 = r9.mOrientation
            if (r7 != r6) goto Lae
            int r5 = r5 - r4
            r2.offsetLeftAndRight(r5)
            goto Lb2
        Lae:
            int r5 = r5 - r4
            r2.offsetTopAndBottom(r5)
        Lb2:
            int r1 = r1 + 1
            goto L67
        Lb5:
            return
    }

    private void resolveShouldLayoutReverse() {
            r2 = this;
            int r0 = r2.mOrientation
            r1 = 1
            if (r0 == r1) goto L12
            boolean r0 = r2.isLayoutRTL()
            if (r0 != 0) goto Lc
            goto L12
        Lc:
            boolean r0 = r2.mReverseLayout
            r0 = r0 ^ r1
            r2.mShouldReverseLayout = r0
            return
        L12:
            boolean r0 = r2.mReverseLayout
            r2.mShouldReverseLayout = r0
            return
    }

    private void setLayoutStateDirection(int r5) {
            r4 = this;
            androidx.recyclerview.widget.LayoutState r0 = r4.mLayoutState
            r0.mLayoutDirection = r5
            boolean r1 = r4.mShouldReverseLayout
            r2 = 1
            r3 = -1
            if (r5 != r3) goto Lc
            r5 = 1
            goto Ld
        Lc:
            r5 = 0
        Ld:
            if (r1 != r5) goto L10
            goto L11
        L10:
            r2 = -1
        L11:
            r0.mItemDirection = r2
            return
    }

    private void updateAllRemainingSpans(int r3, int r4) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r2.mSpanCount
            if (r0 >= r1) goto L1c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r1 = r2.mSpans
            r1 = r1[r0]
            java.util.ArrayList<android.view.View> r1 = r1.mViews
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L12
            goto L19
        L12:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r1 = r2.mSpans
            r1 = r1[r0]
            r2.updateRemainingSpans(r1, r3, r4)
        L19:
            int r0 = r0 + 1
            goto L1
        L1c:
            return
    }

    private boolean updateAnchorFromChildren(androidx.recyclerview.widget.RecyclerView.State r2, androidx.recyclerview.widget.StaggeredGridLayoutManager.AnchorInfo r3) {
            r1 = this;
            boolean r0 = r1.mLastLayoutFromEnd
            if (r0 == 0) goto Ld
            int r2 = r2.getItemCount()
            int r2 = r1.findLastReferenceChildPosition(r2)
            goto L15
        Ld:
            int r2 = r2.getItemCount()
            int r2 = r1.findFirstReferenceChildPosition(r2)
        L15:
            r3.mPosition = r2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.mOffset = r2
            r2 = 1
            return r2
    }

    private void updateLayoutState(int r5, androidx.recyclerview.widget.RecyclerView.State r6) {
            r4 = this;
            androidx.recyclerview.widget.LayoutState r0 = r4.mLayoutState
            r1 = 0
            r0.mAvailable = r1
            r0.mCurrentPosition = r5
            boolean r0 = r4.isSmoothScrolling()
            r2 = 1
            if (r0 == 0) goto L2f
            int r6 = r6.getTargetScrollPosition()
            r0 = -1
            if (r6 == r0) goto L2f
            boolean r0 = r4.mShouldReverseLayout
            if (r6 >= r5) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r0 != r5) goto L26
            androidx.recyclerview.widget.OrientationHelper r5 = r4.mPrimaryOrientation
            int r5 = r5.getTotalSpace()
        L24:
            r6 = 0
            goto L31
        L26:
            androidx.recyclerview.widget.OrientationHelper r5 = r4.mPrimaryOrientation
            int r5 = r5.getTotalSpace()
            r6 = r5
            r5 = 0
            goto L31
        L2f:
            r5 = 0
            goto L24
        L31:
            boolean r0 = r4.getClipToPadding()
            if (r0 == 0) goto L4e
            androidx.recyclerview.widget.LayoutState r0 = r4.mLayoutState
            androidx.recyclerview.widget.OrientationHelper r3 = r4.mPrimaryOrientation
            int r3 = r3.getStartAfterPadding()
            int r3 = r3 - r6
            r0.mStartLine = r3
            androidx.recyclerview.widget.LayoutState r6 = r4.mLayoutState
            androidx.recyclerview.widget.OrientationHelper r0 = r4.mPrimaryOrientation
            int r0 = r0.getEndAfterPadding()
            int r0 = r0 + r5
            r6.mEndLine = r0
            goto L5e
        L4e:
            androidx.recyclerview.widget.LayoutState r0 = r4.mLayoutState
            androidx.recyclerview.widget.OrientationHelper r3 = r4.mPrimaryOrientation
            int r3 = r3.getEnd()
            int r3 = r3 + r5
            r0.mEndLine = r3
            androidx.recyclerview.widget.LayoutState r5 = r4.mLayoutState
            int r6 = -r6
            r5.mStartLine = r6
        L5e:
            androidx.recyclerview.widget.LayoutState r5 = r4.mLayoutState
            r5.mStopInFocusable = r1
            r5.mRecycle = r2
            androidx.recyclerview.widget.OrientationHelper r6 = r4.mPrimaryOrientation
            int r6 = r6.getMode()
            if (r6 != 0) goto L75
            androidx.recyclerview.widget.OrientationHelper r6 = r4.mPrimaryOrientation
            int r6 = r6.getEnd()
            if (r6 != 0) goto L75
            r1 = 1
        L75:
            r5.mInfinite = r1
            return
    }

    private void updateRemainingSpans(androidx.recyclerview.widget.StaggeredGridLayoutManager.Span r4, int r5, int r6) {
            r3 = this;
            int r0 = r4.getDeletedSize()
            r1 = -1
            r2 = 0
            if (r5 != r1) goto L17
            int r5 = r4.getStartLine()
            int r5 = r5 + r0
            if (r5 > r6) goto L25
            java.util.BitSet r5 = r3.mRemainingSpans
            int r4 = r4.mIndex
            r5.set(r4, r2)
            return
        L17:
            int r5 = r4.getEndLine()
            int r5 = r5 - r0
            if (r5 < r6) goto L25
            java.util.BitSet r5 = r3.mRemainingSpans
            int r4 = r4.mIndex
            r5.set(r4, r2)
        L25:
            return
    }

    private int updateSpecWithExtra(int r3, int r4, int r5) {
            r2 = this;
            if (r4 != 0) goto L5
            if (r5 != 0) goto L5
            goto L12
        L5:
            int r0 = android.view.View.MeasureSpec.getMode(r3)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L13
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L12
            goto L13
        L12:
            return r3
        L13:
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            int r3 = r3 - r4
            int r3 = r3 - r5
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            return r3
    }

    boolean areAllEndsEqual() {
            r6 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r0 = r6.mSpans
            r1 = 0
            r0 = r0[r1]
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r0.getEndLine(r2)
            r3 = 1
            r4 = 1
        Ld:
            int r5 = r6.mSpanCount
            if (r4 >= r5) goto L1f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r5 = r6.mSpans
            r5 = r5[r4]
            int r5 = r5.getEndLine(r2)
            if (r5 == r0) goto L1c
            return r1
        L1c:
            int r4 = r4 + 1
            goto Ld
        L1f:
            return r3
    }

    boolean areAllStartsEqual() {
            r6 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r0 = r6.mSpans
            r1 = 0
            r0 = r0[r1]
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r0.getStartLine(r2)
            r3 = 1
            r4 = 1
        Ld:
            int r5 = r6.mSpanCount
            if (r4 >= r5) goto L1f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r5 = r6.mSpans
            r5 = r5[r4]
            int r5 = r5.getStartLine(r2)
            if (r5 == r0) goto L1c
            return r1
        L1c:
            int r4 = r4 + 1
            goto Ld
        L1f:
            return r3
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void assertNotInLayoutOrScroll(java.lang.String r2) {
            r1 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = r1.mPendingSavedState
            if (r0 != 0) goto L7
            super.assertNotInLayoutOrScroll(r2)
        L7:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
            r1 = this;
            int r0 = r1.mOrientation
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
            r2 = this;
            int r0 = r2.mOrientation
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    boolean checkForGaps() {
            r7 = this;
            int r0 = r7.getChildCount()
            r1 = 0
            if (r0 == 0) goto L7d
            int r0 = r7.mGapStrategy
            if (r0 == 0) goto L7d
            boolean r0 = r7.isAttachedToWindow()
            if (r0 != 0) goto L12
            goto L7d
        L12:
            boolean r0 = r7.mShouldReverseLayout
            if (r0 == 0) goto L1f
            int r0 = r7.getLastChildPosition()
            int r2 = r7.getFirstChildPosition()
            goto L27
        L1f:
            int r0 = r7.getFirstChildPosition()
            int r2 = r7.getLastChildPosition()
        L27:
            r3 = 1
            if (r0 != 0) goto L3c
            android.view.View r4 = r7.hasGapsToFix()
            if (r4 == 0) goto L3c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r7.mLazySpanLookup
            r0.clear()
            r7.requestSimpleAnimationsInNextLayout()
            r7.requestLayout()
            return r3
        L3c:
            boolean r4 = r7.mLaidOutInvalidFullSpan
            if (r4 != 0) goto L41
            return r1
        L41:
            boolean r4 = r7.mShouldReverseLayout
            r5 = -1
            if (r4 == 0) goto L48
            r4 = -1
            goto L49
        L48:
            r4 = 1
        L49:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r6 = r7.mLazySpanLookup
            int r2 = r2 + r3
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r6 = r6.getFirstFullSpanItemInRange(r0, r2, r4, r3)
            if (r6 != 0) goto L5a
            r7.mLaidOutInvalidFullSpan = r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r7.mLazySpanLookup
            r0.forceInvalidateAfter(r2)
            return r1
        L5a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r1 = r7.mLazySpanLookup
            int r2 = r6.mPosition
            int r4 = r4 * (-1)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = r1.getFirstFullSpanItemInRange(r0, r2, r4, r3)
            if (r0 != 0) goto L6e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r7.mLazySpanLookup
            int r1 = r6.mPosition
            r0.forceInvalidateAfter(r1)
            goto L76
        L6e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r1 = r7.mLazySpanLookup
            int r0 = r0.mPosition
            int r0 = r0 + r3
            r1.forceInvalidateAfter(r0)
        L76:
            r7.requestSimpleAnimationsInNextLayout()
            r7.requestLayout()
            return r3
        L7d:
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public void collectAdjacentPrefetchPositions(int r5, int r6, androidx.recyclerview.widget.RecyclerView.State r7, androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry r8) {
            r4 = this;
            int r0 = r4.mOrientation
            if (r0 != 0) goto L5
            goto L6
        L5:
            r5 = r6
        L6:
            int r6 = r4.getChildCount()
            if (r6 == 0) goto L7b
            if (r5 != 0) goto Lf
            goto L7b
        Lf:
            r4.prepareLayoutStateForDelta(r5, r7)
            int[] r5 = r4.mPrefetchDistances
            if (r5 == 0) goto L1b
            int r5 = r5.length
            int r6 = r4.mSpanCount
            if (r5 >= r6) goto L21
        L1b:
            int r5 = r4.mSpanCount
            int[] r5 = new int[r5]
            r4.mPrefetchDistances = r5
        L21:
            r5 = 0
            r6 = 0
            r0 = 0
        L24:
            int r1 = r4.mSpanCount
            if (r6 >= r1) goto L55
            androidx.recyclerview.widget.LayoutState r1 = r4.mLayoutState
            int r2 = r1.mItemDirection
            r3 = -1
            if (r2 != r3) goto L3b
            int r1 = r1.mStartLine
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r2 = r4.mSpans
            r2 = r2[r6]
            int r2 = r2.getStartLine(r1)
        L39:
            int r1 = r1 - r2
            goto L4a
        L3b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r2 = r4.mSpans
            r2 = r2[r6]
            int r1 = r1.mEndLine
            int r1 = r2.getEndLine(r1)
            androidx.recyclerview.widget.LayoutState r2 = r4.mLayoutState
            int r2 = r2.mEndLine
            goto L39
        L4a:
            if (r1 < 0) goto L52
            int[] r2 = r4.mPrefetchDistances
            r2[r0] = r1
            int r0 = r0 + 1
        L52:
            int r6 = r6 + 1
            goto L24
        L55:
            int[] r6 = r4.mPrefetchDistances
            java.util.Arrays.sort(r6, r5, r0)
        L5a:
            if (r5 >= r0) goto L7b
            androidx.recyclerview.widget.LayoutState r6 = r4.mLayoutState
            boolean r6 = r6.hasMore(r7)
            if (r6 == 0) goto L7b
            androidx.recyclerview.widget.LayoutState r6 = r4.mLayoutState
            int r6 = r6.mCurrentPosition
            int[] r1 = r4.mPrefetchDistances
            r1 = r1[r5]
            r8.addPosition(r6, r1)
            androidx.recyclerview.widget.LayoutState r6 = r4.mLayoutState
            int r1 = r6.mCurrentPosition
            int r2 = r6.mItemDirection
            int r1 = r1 + r2
            r6.mCurrentPosition = r1
            int r5 = r5 + 1
            goto L5a
        L7b:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(androidx.recyclerview.widget.RecyclerView.State r1) {
            r0 = this;
            int r1 = r0.computeScrollExtent(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(androidx.recyclerview.widget.RecyclerView.State r1) {
            r0 = this;
            int r1 = r0.computeScrollOffset(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(androidx.recyclerview.widget.RecyclerView.State r1) {
            r0 = this;
            int r1 = r0.computeScrollRange(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public android.graphics.PointF computeScrollVectorForPosition(int r4) {
            r3 = this;
            int r4 = r3.calculateScrollDirectionForPosition(r4)
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            if (r4 != 0) goto Ld
            r4 = 0
            return r4
        Ld:
            int r1 = r3.mOrientation
            r2 = 0
            if (r1 != 0) goto L18
            float r4 = (float) r4
            r0.x = r4
            r0.y = r2
            return r0
        L18:
            r0.x = r2
            float r4 = (float) r4
            r0.y = r4
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(androidx.recyclerview.widget.RecyclerView.State r1) {
            r0 = this;
            int r1 = r0.computeScrollExtent(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(androidx.recyclerview.widget.RecyclerView.State r1) {
            r0 = this;
            int r1 = r0.computeScrollOffset(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(androidx.recyclerview.widget.RecyclerView.State r1) {
            r0 = this;
            int r1 = r0.computeScrollRange(r1)
            return r1
    }

    public int[] findFirstCompletelyVisibleItemPositions(int[] r4) {
            r3 = this;
            if (r4 != 0) goto L7
            int r4 = r3.mSpanCount
            int[] r4 = new int[r4]
            goto Lc
        L7:
            int r0 = r4.length
            int r1 = r3.mSpanCount
            if (r0 < r1) goto L1f
        Lc:
            r0 = 0
        Ld:
            int r1 = r3.mSpanCount
            if (r0 >= r1) goto L1e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r1 = r3.mSpans
            r1 = r1[r0]
            int r1 = r1.findFirstCompletelyVisibleItemPosition()
            r4[r0] = r1
            int r0 = r0 + 1
            goto Ld
        L1e:
            return r4
        L1f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Provided int[]'s size must be more than or equal to span count. Expected:"
            r1.append(r2)
            int r2 = r3.mSpanCount
            r1.append(r2)
            java.lang.String r2 = ", array size:"
            r1.append(r2)
            int r4 = r4.length
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    android.view.View findFirstVisibleItemClosestToEnd(boolean r8) {
            r7 = this;
            androidx.recyclerview.widget.OrientationHelper r0 = r7.mPrimaryOrientation
            int r0 = r0.getStartAfterPadding()
            androidx.recyclerview.widget.OrientationHelper r1 = r7.mPrimaryOrientation
            int r1 = r1.getEndAfterPadding()
            int r2 = r7.getChildCount()
            int r2 = r2 + (-1)
            r3 = 0
        L13:
            if (r2 < 0) goto L37
            android.view.View r4 = r7.getChildAt(r2)
            androidx.recyclerview.widget.OrientationHelper r5 = r7.mPrimaryOrientation
            int r5 = r5.getDecoratedStart(r4)
            androidx.recyclerview.widget.OrientationHelper r6 = r7.mPrimaryOrientation
            int r6 = r6.getDecoratedEnd(r4)
            if (r6 <= r0) goto L34
            if (r5 < r1) goto L2a
            goto L34
        L2a:
            if (r6 <= r1) goto L33
            if (r8 != 0) goto L2f
            goto L33
        L2f:
            if (r3 != 0) goto L34
            r3 = r4
            goto L34
        L33:
            return r4
        L34:
            int r2 = r2 + (-1)
            goto L13
        L37:
            return r3
    }

    android.view.View findFirstVisibleItemClosestToStart(boolean r9) {
            r8 = this;
            androidx.recyclerview.widget.OrientationHelper r0 = r8.mPrimaryOrientation
            int r0 = r0.getStartAfterPadding()
            androidx.recyclerview.widget.OrientationHelper r1 = r8.mPrimaryOrientation
            int r1 = r1.getEndAfterPadding()
            int r2 = r8.getChildCount()
            r3 = 0
            r4 = 0
        L12:
            if (r4 >= r2) goto L36
            android.view.View r5 = r8.getChildAt(r4)
            androidx.recyclerview.widget.OrientationHelper r6 = r8.mPrimaryOrientation
            int r6 = r6.getDecoratedStart(r5)
            androidx.recyclerview.widget.OrientationHelper r7 = r8.mPrimaryOrientation
            int r7 = r7.getDecoratedEnd(r5)
            if (r7 <= r0) goto L33
            if (r6 < r1) goto L29
            goto L33
        L29:
            if (r6 >= r0) goto L32
            if (r9 != 0) goto L2e
            goto L32
        L2e:
            if (r3 != 0) goto L33
            r3 = r5
            goto L33
        L32:
            return r5
        L33:
            int r4 = r4 + 1
            goto L12
        L36:
            return r3
    }

    int findFirstVisibleItemPositionInt() {
            r2 = this;
            boolean r0 = r2.mShouldReverseLayout
            r1 = 1
            if (r0 == 0) goto La
            android.view.View r0 = r2.findFirstVisibleItemClosestToEnd(r1)
            goto Le
        La:
            android.view.View r0 = r2.findFirstVisibleItemClosestToStart(r1)
        Le:
            if (r0 != 0) goto L12
            r0 = -1
            return r0
        L12:
            int r0 = r2.getPosition(r0)
            return r0
    }

    public int[] findFirstVisibleItemPositions(int[] r4) {
            r3 = this;
            if (r4 != 0) goto L7
            int r4 = r3.mSpanCount
            int[] r4 = new int[r4]
            goto Lc
        L7:
            int r0 = r4.length
            int r1 = r3.mSpanCount
            if (r0 < r1) goto L1f
        Lc:
            r0 = 0
        Ld:
            int r1 = r3.mSpanCount
            if (r0 >= r1) goto L1e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r1 = r3.mSpans
            r1 = r1[r0]
            int r1 = r1.findFirstVisibleItemPosition()
            r4[r0] = r1
            int r0 = r0 + 1
            goto Ld
        L1e:
            return r4
        L1f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Provided int[]'s size must be more than or equal to span count. Expected:"
            r1.append(r2)
            int r2 = r3.mSpanCount
            r1.append(r2)
            java.lang.String r2 = ", array size:"
            r1.append(r2)
            int r4 = r4.length
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public int[] findLastCompletelyVisibleItemPositions(int[] r4) {
            r3 = this;
            if (r4 != 0) goto L7
            int r4 = r3.mSpanCount
            int[] r4 = new int[r4]
            goto Lc
        L7:
            int r0 = r4.length
            int r1 = r3.mSpanCount
            if (r0 < r1) goto L1f
        Lc:
            r0 = 0
        Ld:
            int r1 = r3.mSpanCount
            if (r0 >= r1) goto L1e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r1 = r3.mSpans
            r1 = r1[r0]
            int r1 = r1.findLastCompletelyVisibleItemPosition()
            r4[r0] = r1
            int r0 = r0 + 1
            goto Ld
        L1e:
            return r4
        L1f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Provided int[]'s size must be more than or equal to span count. Expected:"
            r1.append(r2)
            int r2 = r3.mSpanCount
            r1.append(r2)
            java.lang.String r2 = ", array size:"
            r1.append(r2)
            int r4 = r4.length
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public int[] findLastVisibleItemPositions(int[] r4) {
            r3 = this;
            if (r4 != 0) goto L7
            int r4 = r3.mSpanCount
            int[] r4 = new int[r4]
            goto Lc
        L7:
            int r0 = r4.length
            int r1 = r3.mSpanCount
            if (r0 < r1) goto L1f
        Lc:
            r0 = 0
        Ld:
            int r1 = r3.mSpanCount
            if (r0 >= r1) goto L1e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r1 = r3.mSpans
            r1 = r1[r0]
            int r1 = r1.findLastVisibleItemPosition()
            r4[r0] = r1
            int r0 = r0 + 1
            goto Ld
        L1e:
            return r4
        L1f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Provided int[]'s size must be more than or equal to span count. Expected:"
            r1.append(r2)
            int r2 = r3.mSpanCount
            r1.append(r2)
            java.lang.String r2 = ", array size:"
            r1.append(r2)
            int r4 = r4.length
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
            r3 = this;
            int r0 = r3.mOrientation
            r1 = -1
            r2 = -2
            if (r0 != 0) goto Lc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams
            r0.<init>(r2, r1)
            return r0
        Lc:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams
            r0.<init>(r1, r2)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams
            r0.<init>(r2, r3)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            return r0
        Lc:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams
            r0.<init>(r2)
            return r0
    }

    int getFirstChildPosition() {
            r2 = this;
            int r0 = r2.getChildCount()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.view.View r0 = r2.getChildAt(r1)
            int r0 = r2.getPosition(r0)
            return r0
    }

    public int getGapStrategy() {
            r1 = this;
            int r0 = r1.mGapStrategy
            return r0
    }

    int getLastChildPosition() {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r0 + (-1)
            android.view.View r0 = r1.getChildAt(r0)
            int r0 = r1.getPosition(r0)
            return r0
    }

    public int getOrientation() {
            r1 = this;
            int r0 = r1.mOrientation
            return r0
    }

    public boolean getReverseLayout() {
            r1 = this;
            boolean r0 = r1.mReverseLayout
            return r0
    }

    public int getSpanCount() {
            r1 = this;
            int r0 = r1.mSpanCount
            return r0
    }

    android.view.View hasGapsToFix() {
            r12 = this;
            int r0 = r12.getChildCount()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.mSpanCount
            r2.<init>(r3)
            int r3 = r12.mSpanCount
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r12.mOrientation
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r12.isLayoutRTL()
            if (r3 == 0) goto L21
            r3 = 1
            goto L22
        L21:
            r3 = -1
        L22:
            boolean r7 = r12.mShouldReverseLayout
            if (r7 == 0) goto L28
            r0 = -1
            goto L29
        L28:
            r1 = 0
        L29:
            if (r1 >= r0) goto L2c
            r6 = 1
        L2c:
            if (r1 == r0) goto La4
            android.view.View r7 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r9 = r8.mSpan
            int r9 = r9.mIndex
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L52
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r9 = r8.mSpan
            boolean r9 = r12.checkSpanForGap(r9)
            if (r9 == 0) goto L4b
            goto La1
        L4b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r9 = r8.mSpan
            int r9 = r9.mIndex
            r2.clear(r9)
        L52:
            boolean r9 = r8.mFullSpan
            if (r9 == 0) goto L57
            goto La2
        L57:
            int r9 = r1 + r6
            if (r9 == r0) goto La2
            android.view.View r9 = r12.getChildAt(r9)
            boolean r10 = r12.mShouldReverseLayout
            if (r10 == 0) goto L75
            androidx.recyclerview.widget.OrientationHelper r10 = r12.mPrimaryOrientation
            int r10 = r10.getDecoratedEnd(r7)
            androidx.recyclerview.widget.OrientationHelper r11 = r12.mPrimaryOrientation
            int r11 = r11.getDecoratedEnd(r9)
            if (r10 >= r11) goto L72
            goto La1
        L72:
            if (r10 != r11) goto La2
            goto L86
        L75:
            androidx.recyclerview.widget.OrientationHelper r10 = r12.mPrimaryOrientation
            int r10 = r10.getDecoratedStart(r7)
            androidx.recyclerview.widget.OrientationHelper r11 = r12.mPrimaryOrientation
            int r11 = r11.getDecoratedStart(r9)
            if (r10 <= r11) goto L84
            goto La1
        L84:
            if (r10 != r11) goto La2
        L86:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r8 = r8.mSpan
            int r8 = r8.mIndex
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r9 = r9.mSpan
            int r9 = r9.mIndex
            int r8 = r8 - r9
            if (r8 >= 0) goto L99
            r8 = 1
            goto L9a
        L99:
            r8 = 0
        L9a:
            if (r3 >= 0) goto L9e
            r9 = 1
            goto L9f
        L9e:
            r9 = 0
        L9f:
            if (r8 == r9) goto La2
        La1:
            return r7
        La2:
            int r1 = r1 + r6
            goto L2c
        La4:
            r0 = 0
            return r0
    }

    public void invalidateSpanAssignments() {
            r1 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r1.mLazySpanLookup
            r0.clear()
            r1.requestLayout()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
            r1 = this;
            int r0 = r1.mGapStrategy
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    boolean isLayoutRTL() {
            r2 = this;
            int r0 = r2.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto L8
            return r1
        L8:
            r0 = 0
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenHorizontal(int r3) {
            r2 = this;
            super.offsetChildrenHorizontal(r3)
            r0 = 0
        L4:
            int r1 = r2.mSpanCount
            if (r0 >= r1) goto L12
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r1 = r2.mSpans
            r1 = r1[r0]
            r1.onOffset(r3)
            int r0 = r0 + 1
            goto L4
        L12:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenVertical(int r3) {
            r2 = this;
            super.offsetChildrenVertical(r3)
            r0 = 0
        L4:
            int r1 = r2.mSpanCount
            if (r0 >= r1) goto L12
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r1 = r2.mSpans
            r1 = r1[r0]
            r1.onOffset(r3)
            int r0 = r0 + 1
            goto L4
        L12:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.Adapter r1, @androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.Adapter r2) {
            r0 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r1 = r0.mLazySpanLookup
            r1.clear()
            r1 = 0
        L6:
            int r2 = r0.mSpanCount
            if (r1 >= r2) goto L14
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r2 = r0.mSpans
            r2 = r2[r1]
            r2.clear()
            int r1 = r1 + 1
            goto L6
        L14:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(androidx.recyclerview.widget.RecyclerView r2, androidx.recyclerview.widget.RecyclerView.Recycler r3) {
            r1 = this;
            super.onDetachedFromWindow(r2, r3)
            java.lang.Runnable r3 = r1.mCheckForGapsRunnable
            r1.removeCallbacks(r3)
            r3 = 0
        L9:
            int r0 = r1.mSpanCount
            if (r3 >= r0) goto L17
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r0 = r1.mSpans
            r0 = r0[r3]
            r0.clear()
            int r3 = r3 + 1
            goto L9
        L17:
            r2.requestLayout()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @androidx.annotation.Nullable
    public android.view.View onFocusSearchFailed(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.Recycler r11, androidx.recyclerview.widget.RecyclerView.State r12) {
            r8 = this;
            int r0 = r8.getChildCount()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.view.View r9 = r8.findContainingItemView(r9)
            if (r9 != 0) goto Lf
            return r1
        Lf:
            r8.resolveShouldLayoutReverse()
            int r10 = r8.convertFocusDirectionToLayoutDirection(r10)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 != r0) goto L1b
            return r1
        L1b:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r0
            boolean r2 = r0.mFullSpan
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r0 = r0.mSpan
            r3 = 1
            if (r10 != r3) goto L2d
            int r4 = r8.getLastChildPosition()
            goto L31
        L2d:
            int r4 = r8.getFirstChildPosition()
        L31:
            r8.updateLayoutState(r4, r12)
            r8.setLayoutStateDirection(r10)
            androidx.recyclerview.widget.LayoutState r5 = r8.mLayoutState
            int r6 = r5.mItemDirection
            int r6 = r6 + r4
            r5.mCurrentPosition = r6
            androidx.recyclerview.widget.OrientationHelper r6 = r8.mPrimaryOrientation
            int r6 = r6.getTotalSpace()
            float r6 = (float) r6
            r7 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r6 = r6 * r7
            int r6 = (int) r6
            r5.mAvailable = r6
            androidx.recyclerview.widget.LayoutState r5 = r8.mLayoutState
            r5.mStopInFocusable = r3
            r6 = 0
            r5.mRecycle = r6
            r8.fill(r11, r5, r12)
            boolean r11 = r8.mShouldReverseLayout
            r8.mLastLayoutFromEnd = r11
            if (r2 != 0) goto L66
            android.view.View r11 = r0.getFocusableViewAfter(r4, r10)
            if (r11 == 0) goto L66
            if (r11 == r9) goto L66
            return r11
        L66:
            boolean r11 = r8.preferLastSpan(r10)
            if (r11 == 0) goto L81
            int r11 = r8.mSpanCount
            int r11 = r11 - r3
        L6f:
            if (r11 < 0) goto L96
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r12 = r8.mSpans
            r12 = r12[r11]
            android.view.View r12 = r12.getFocusableViewAfter(r4, r10)
            if (r12 == 0) goto L7e
            if (r12 == r9) goto L7e
            return r12
        L7e:
            int r11 = r11 + (-1)
            goto L6f
        L81:
            r11 = 0
        L82:
            int r12 = r8.mSpanCount
            if (r11 >= r12) goto L96
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r12 = r8.mSpans
            r12 = r12[r11]
            android.view.View r12 = r12.getFocusableViewAfter(r4, r10)
            if (r12 == 0) goto L93
            if (r12 == r9) goto L93
            return r12
        L93:
            int r11 = r11 + 1
            goto L82
        L96:
            boolean r11 = r8.mReverseLayout
            r11 = r11 ^ r3
            r12 = -1
            if (r10 != r12) goto L9e
            r12 = 1
            goto L9f
        L9e:
            r12 = 0
        L9f:
            if (r11 != r12) goto La3
            r11 = 1
            goto La4
        La3:
            r11 = 0
        La4:
            if (r2 != 0) goto Lba
            if (r11 == 0) goto Lad
            int r12 = r0.findFirstPartiallyVisibleItemPosition()
            goto Lb1
        Lad:
            int r12 = r0.findLastPartiallyVisibleItemPosition()
        Lb1:
            android.view.View r12 = r8.findViewByPosition(r12)
            if (r12 == 0) goto Lba
            if (r12 == r9) goto Lba
            return r12
        Lba:
            boolean r10 = r8.preferLastSpan(r10)
            if (r10 == 0) goto Le9
            int r10 = r8.mSpanCount
            int r10 = r10 - r3
        Lc3:
            if (r10 < 0) goto L10c
            int r12 = r0.mIndex
            if (r10 != r12) goto Lca
            goto Le6
        Lca:
            if (r11 == 0) goto Ld5
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r12 = r8.mSpans
            r12 = r12[r10]
            int r12 = r12.findFirstPartiallyVisibleItemPosition()
            goto Ldd
        Ld5:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r12 = r8.mSpans
            r12 = r12[r10]
            int r12 = r12.findLastPartiallyVisibleItemPosition()
        Ldd:
            android.view.View r12 = r8.findViewByPosition(r12)
            if (r12 == 0) goto Le6
            if (r12 == r9) goto Le6
            return r12
        Le6:
            int r10 = r10 + (-1)
            goto Lc3
        Le9:
            int r10 = r8.mSpanCount
            if (r6 >= r10) goto L10c
            if (r11 == 0) goto Lf8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r10 = r8.mSpans
            r10 = r10[r6]
            int r10 = r10.findFirstPartiallyVisibleItemPosition()
            goto L100
        Lf8:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r10 = r8.mSpans
            r10 = r10[r6]
            int r10 = r10.findLastPartiallyVisibleItemPosition()
        L100:
            android.view.View r10 = r8.findViewByPosition(r10)
            if (r10 == 0) goto L109
            if (r10 == r9) goto L109
            return r10
        L109:
            int r6 = r6 + 1
            goto Le9
        L10c:
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r3) {
            r2 = this;
            super.onInitializeAccessibilityEvent(r3)
            int r0 = r2.getChildCount()
            if (r0 <= 0) goto L2e
            r0 = 0
            android.view.View r1 = r2.findFirstVisibleItemClosestToStart(r0)
            android.view.View r0 = r2.findFirstVisibleItemClosestToEnd(r0)
            if (r1 == 0) goto L2e
            if (r0 != 0) goto L17
            goto L2e
        L17:
            int r1 = r2.getPosition(r1)
            int r0 = r2.getPosition(r0)
            if (r1 >= r0) goto L28
            r3.setFromIndex(r1)
            r3.setToIndex(r0)
            return
        L28:
            r3.setFromIndex(r0)
            r3.setToIndex(r1)
        L2e:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
            r0 = this;
            r1 = 1
            r0.handleUpdate(r2, r3, r1)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r1 = r0.mLazySpanLookup
            r1.clear()
            r0.requestLayout()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3, int r4) {
            r0 = this;
            r1 = 8
            r0.handleUpdate(r2, r3, r1)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
            r0 = this;
            r1 = 2
            r0.handleUpdate(r2, r3, r1)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3, java.lang.Object r4) {
            r0 = this;
            r1 = 4
            r0.handleUpdate(r2, r3, r1)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler r2, androidx.recyclerview.widget.RecyclerView.State r3) {
            r1 = this;
            r0 = 1
            r1.onLayoutChildren(r2, r3, r0)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(androidx.recyclerview.widget.RecyclerView.State r1) {
            r0 = this;
            super.onLayoutCompleted(r1)
            r1 = -1
            r0.mPendingScrollPosition = r1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.mPendingScrollPositionOffset = r1
            r1 = 0
            r0.mPendingSavedState = r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$AnchorInfo r1 = r0.mAnchorInfo
            r1.reset()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(android.os.Parcelable r3) {
            r2 = this;
            boolean r0 = r3 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState
            if (r0 == 0) goto L18
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState) r3
            r2.mPendingSavedState = r3
            int r0 = r2.mPendingScrollPosition
            r1 = -1
            if (r0 == r1) goto L15
            r3.invalidateAnchorPositionInfo()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r3 = r2.mPendingSavedState
            r3.invalidateSpanInfo()
        L15:
            r2.requestLayout()
        L18:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public android.os.Parcelable onSaveInstanceState() {
            r4 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = r4.mPendingSavedState
            if (r0 == 0) goto Lc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r4.mPendingSavedState
            r0.<init>(r1)
            return r0
        Lc:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState
            r0.<init>()
            boolean r1 = r4.mReverseLayout
            r0.mReverseLayout = r1
            boolean r1 = r4.mLastLayoutFromEnd
            r0.mAnchorLayoutFromEnd = r1
            boolean r1 = r4.mLastLayoutRTL
            r0.mLastLayoutRTL = r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r1 = r4.mLazySpanLookup
            r2 = 0
            if (r1 == 0) goto L30
            int[] r3 = r1.mData
            if (r3 == 0) goto L30
            r0.mSpanLookup = r3
            int r3 = r3.length
            r0.mSpanLookupSize = r3
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r1 = r1.mFullSpanItems
            r0.mFullSpanItems = r1
            goto L32
        L30:
            r0.mSpanLookupSize = r2
        L32:
            int r1 = r4.getChildCount()
            if (r1 <= 0) goto L8a
            boolean r1 = r4.mLastLayoutFromEnd
            if (r1 == 0) goto L41
            int r1 = r4.getLastChildPosition()
            goto L45
        L41:
            int r1 = r4.getFirstChildPosition()
        L45:
            r0.mAnchorPosition = r1
            int r1 = r4.findFirstVisibleItemPositionInt()
            r0.mVisibleAnchorPosition = r1
            int r1 = r4.mSpanCount
            r0.mSpanOffsetsSize = r1
            int[] r1 = new int[r1]
            r0.mSpanOffsets = r1
        L55:
            int r1 = r4.mSpanCount
            if (r2 >= r1) goto L89
            boolean r1 = r4.mLastLayoutFromEnd
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L71
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r1 = r4.mSpans
            r1 = r1[r2]
            int r1 = r1.getEndLine(r3)
            if (r1 == r3) goto L82
            androidx.recyclerview.widget.OrientationHelper r3 = r4.mPrimaryOrientation
            int r3 = r3.getEndAfterPadding()
        L6f:
            int r1 = r1 - r3
            goto L82
        L71:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r1 = r4.mSpans
            r1 = r1[r2]
            int r1 = r1.getStartLine(r3)
            if (r1 == r3) goto L82
            androidx.recyclerview.widget.OrientationHelper r3 = r4.mPrimaryOrientation
            int r3 = r3.getStartAfterPadding()
            goto L6f
        L82:
            int[] r3 = r0.mSpanOffsets
            r3[r2] = r1
            int r2 = r2 + 1
            goto L55
        L89:
            return r0
        L8a:
            r1 = -1
            r0.mAnchorPosition = r1
            r0.mVisibleAnchorPosition = r1
            r0.mSpanOffsetsSize = r2
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int r1) {
            r0 = this;
            if (r1 != 0) goto L5
            r0.checkForGaps()
        L5:
            return
    }

    void prepareLayoutStateForDelta(int r5, androidx.recyclerview.widget.RecyclerView.State r6) {
            r4 = this;
            r0 = 1
            if (r5 <= 0) goto L9
            int r1 = r4.getLastChildPosition()
            r2 = 1
            goto Le
        L9:
            int r1 = r4.getFirstChildPosition()
            r2 = -1
        Le:
            androidx.recyclerview.widget.LayoutState r3 = r4.mLayoutState
            r3.mRecycle = r0
            r4.updateLayoutState(r1, r6)
            r4.setLayoutStateDirection(r2)
            androidx.recyclerview.widget.LayoutState r6 = r4.mLayoutState
            int r0 = r6.mItemDirection
            int r1 = r1 + r0
            r6.mCurrentPosition = r1
            int r5 = java.lang.Math.abs(r5)
            r6.mAvailable = r5
            return
    }

    int scrollBy(int r3, androidx.recyclerview.widget.RecyclerView.Recycler r4, androidx.recyclerview.widget.RecyclerView.State r5) {
            r2 = this;
            int r0 = r2.getChildCount()
            r1 = 0
            if (r0 == 0) goto L31
            if (r3 != 0) goto La
            goto L31
        La:
            r2.prepareLayoutStateForDelta(r3, r5)
            androidx.recyclerview.widget.LayoutState r0 = r2.mLayoutState
            int r5 = r2.fill(r4, r0, r5)
            androidx.recyclerview.widget.LayoutState r0 = r2.mLayoutState
            int r0 = r0.mAvailable
            if (r0 >= r5) goto L1a
            goto L1f
        L1a:
            if (r3 >= 0) goto L1e
            int r3 = -r5
            goto L1f
        L1e:
            r3 = r5
        L1f:
            androidx.recyclerview.widget.OrientationHelper r5 = r2.mPrimaryOrientation
            int r0 = -r3
            r5.offsetChildren(r0)
            boolean r5 = r2.mShouldReverseLayout
            r2.mLastLayoutFromEnd = r5
            androidx.recyclerview.widget.LayoutState r5 = r2.mLayoutState
            r5.mAvailable = r1
            r2.recycle(r4, r5)
            return r3
        L31:
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int r1, androidx.recyclerview.widget.RecyclerView.Recycler r2, androidx.recyclerview.widget.RecyclerView.State r3) {
            r0 = this;
            int r1 = r0.scrollBy(r1, r2, r3)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int r3) {
            r2 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = r2.mPendingSavedState
            if (r0 == 0) goto Lb
            int r1 = r0.mAnchorPosition
            if (r1 == r3) goto Lb
            r0.invalidateAnchorPositionInfo()
        Lb:
            r2.mPendingScrollPosition = r3
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.mPendingScrollPositionOffset = r3
            r2.requestLayout()
            return
    }

    public void scrollToPositionWithOffset(int r2, int r3) {
            r1 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = r1.mPendingSavedState
            if (r0 == 0) goto L7
            r0.invalidateAnchorPositionInfo()
        L7:
            r1.mPendingScrollPosition = r2
            r1.mPendingScrollPositionOffset = r3
            r1.requestLayout()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int r1, androidx.recyclerview.widget.RecyclerView.Recycler r2, androidx.recyclerview.widget.RecyclerView.State r3) {
            r0 = this;
            int r1 = r0.scrollBy(r1, r2, r3)
            return r1
    }

    public void setGapStrategy(int r2) {
            r1 = this;
            r0 = 0
            r1.assertNotInLayoutOrScroll(r0)
            int r0 = r1.mGapStrategy
            if (r2 != r0) goto L9
            return
        L9:
            if (r2 == 0) goto L17
            r0 = 2
            if (r2 != r0) goto Lf
            goto L17
        Lf:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS"
            r2.<init>(r0)
            throw r2
        L17:
            r1.mGapStrategy = r2
            r1.requestLayout()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(android.graphics.Rect r5, int r6, int r7) {
            r4 = this;
            int r0 = r4.getPaddingLeft()
            int r1 = r4.getPaddingRight()
            int r0 = r0 + r1
            int r1 = r4.getPaddingTop()
            int r2 = r4.getPaddingBottom()
            int r1 = r1 + r2
            int r2 = r4.mOrientation
            r3 = 1
            if (r2 != r3) goto L34
            int r5 = r5.height()
            int r5 = r5 + r1
            int r1 = r4.getMinimumHeight()
            int r5 = androidx.recyclerview.widget.RecyclerView.LayoutManager.chooseSize(r7, r5, r1)
            int r7 = r4.mSizePerSpan
            int r1 = r4.mSpanCount
            int r7 = r7 * r1
            int r7 = r7 + r0
            int r0 = r4.getMinimumWidth()
            int r6 = androidx.recyclerview.widget.RecyclerView.LayoutManager.chooseSize(r6, r7, r0)
            goto L50
        L34:
            int r5 = r5.width()
            int r5 = r5 + r0
            int r0 = r4.getMinimumWidth()
            int r6 = androidx.recyclerview.widget.RecyclerView.LayoutManager.chooseSize(r6, r5, r0)
            int r5 = r4.mSizePerSpan
            int r0 = r4.mSpanCount
            int r5 = r5 * r0
            int r5 = r5 + r1
            int r0 = r4.getMinimumHeight()
            int r5 = androidx.recyclerview.widget.RecyclerView.LayoutManager.chooseSize(r7, r5, r0)
        L50:
            r4.setMeasuredDimension(r6, r5)
            return
    }

    public void setOrientation(int r2) {
            r1 = this;
            if (r2 == 0) goto Le
            r0 = 1
            if (r2 != r0) goto L6
            goto Le
        L6:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "invalid orientation."
            r2.<init>(r0)
            throw r2
        Le:
            r0 = 0
            r1.assertNotInLayoutOrScroll(r0)
            int r0 = r1.mOrientation
            if (r2 != r0) goto L17
            return
        L17:
            r1.mOrientation = r2
            androidx.recyclerview.widget.OrientationHelper r2 = r1.mPrimaryOrientation
            androidx.recyclerview.widget.OrientationHelper r0 = r1.mSecondaryOrientation
            r1.mPrimaryOrientation = r0
            r1.mSecondaryOrientation = r2
            r1.requestLayout()
            return
    }

    public void setReverseLayout(boolean r3) {
            r2 = this;
            r0 = 0
            r2.assertNotInLayoutOrScroll(r0)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = r2.mPendingSavedState
            if (r0 == 0) goto Le
            boolean r1 = r0.mReverseLayout
            if (r1 == r3) goto Le
            r0.mReverseLayout = r3
        Le:
            r2.mReverseLayout = r3
            r2.requestLayout()
            return
    }

    public void setSpanCount(int r3) {
            r2 = this;
            r0 = 0
            r2.assertNotInLayoutOrScroll(r0)
            int r0 = r2.mSpanCount
            if (r3 == r0) goto L30
            r2.invalidateSpanAssignments()
            r2.mSpanCount = r3
            java.util.BitSet r3 = new java.util.BitSet
            int r0 = r2.mSpanCount
            r3.<init>(r0)
            r2.mRemainingSpans = r3
            int r3 = r2.mSpanCount
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r3 = new androidx.recyclerview.widget.StaggeredGridLayoutManager.Span[r3]
            r2.mSpans = r3
            r3 = 0
        L1d:
            int r0 = r2.mSpanCount
            if (r3 >= r0) goto L2d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r0 = r2.mSpans
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r1 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$Span
            r1.<init>(r2, r3)
            r0[r3] = r1
            int r3 = r3 + 1
            goto L1d
        L2d:
            r2.requestLayout()
        L30:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.State r2, int r3) {
            r0 = this;
            androidx.recyclerview.widget.LinearSmoothScroller r2 = new androidx.recyclerview.widget.LinearSmoothScroller
            android.content.Context r1 = r1.getContext()
            r2.<init>(r1)
            r2.setTargetPosition(r3)
            r0.startSmoothScroll(r2)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
            r1 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = r1.mPendingSavedState
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    boolean updateAnchorFromPendingData(androidx.recyclerview.widget.RecyclerView.State r6, androidx.recyclerview.widget.StaggeredGridLayoutManager.AnchorInfo r7) {
            r5 = this;
            boolean r0 = r6.isPreLayout()
            r1 = 0
            if (r0 != 0) goto Lde
            int r0 = r5.mPendingScrollPosition
            r2 = -1
            if (r0 != r2) goto Le
            goto Lde
        Le:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 < 0) goto Lda
            int r6 = r6.getItemCount()
            if (r0 < r6) goto L1a
            goto Lda
        L1a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r5.mPendingSavedState
            r0 = 1
            if (r6 == 0) goto L30
            int r4 = r6.mAnchorPosition
            if (r4 == r2) goto L30
            int r6 = r6.mSpanOffsetsSize
            if (r6 >= r0) goto L28
            goto L30
        L28:
            r7.mOffset = r3
            int r6 = r5.mPendingScrollPosition
            r7.mPosition = r6
            goto Ld9
        L30:
            int r6 = r5.mPendingScrollPosition
            android.view.View r6 = r5.findViewByPosition(r6)
            if (r6 == 0) goto Lbf
            boolean r1 = r5.mShouldReverseLayout
            if (r1 == 0) goto L41
            int r1 = r5.getLastChildPosition()
            goto L45
        L41:
            int r1 = r5.getFirstChildPosition()
        L45:
            r7.mPosition = r1
            int r1 = r5.mPendingScrollPositionOffset
            if (r1 == r3) goto L75
            boolean r1 = r7.mLayoutFromEnd
            if (r1 == 0) goto L62
            androidx.recyclerview.widget.OrientationHelper r1 = r5.mPrimaryOrientation
            int r1 = r1.getEndAfterPadding()
            int r2 = r5.mPendingScrollPositionOffset
            int r1 = r1 - r2
            androidx.recyclerview.widget.OrientationHelper r2 = r5.mPrimaryOrientation
            int r6 = r2.getDecoratedEnd(r6)
            int r1 = r1 - r6
            r7.mOffset = r1
            goto L74
        L62:
            androidx.recyclerview.widget.OrientationHelper r1 = r5.mPrimaryOrientation
            int r1 = r1.getStartAfterPadding()
            int r2 = r5.mPendingScrollPositionOffset
            int r1 = r1 + r2
            androidx.recyclerview.widget.OrientationHelper r2 = r5.mPrimaryOrientation
            int r6 = r2.getDecoratedStart(r6)
            int r1 = r1 - r6
            r7.mOffset = r1
        L74:
            return r0
        L75:
            androidx.recyclerview.widget.OrientationHelper r1 = r5.mPrimaryOrientation
            int r1 = r1.getDecoratedMeasurement(r6)
            androidx.recyclerview.widget.OrientationHelper r2 = r5.mPrimaryOrientation
            int r2 = r2.getTotalSpace()
            if (r1 <= r2) goto L97
            boolean r6 = r7.mLayoutFromEnd
            if (r6 == 0) goto L8e
            androidx.recyclerview.widget.OrientationHelper r6 = r5.mPrimaryOrientation
            int r6 = r6.getEndAfterPadding()
            goto L94
        L8e:
            androidx.recyclerview.widget.OrientationHelper r6 = r5.mPrimaryOrientation
            int r6 = r6.getStartAfterPadding()
        L94:
            r7.mOffset = r6
            return r0
        L97:
            androidx.recyclerview.widget.OrientationHelper r1 = r5.mPrimaryOrientation
            int r1 = r1.getDecoratedStart(r6)
            androidx.recyclerview.widget.OrientationHelper r2 = r5.mPrimaryOrientation
            int r2 = r2.getStartAfterPadding()
            int r1 = r1 - r2
            if (r1 >= 0) goto Laa
            int r6 = -r1
            r7.mOffset = r6
            return r0
        Laa:
            androidx.recyclerview.widget.OrientationHelper r1 = r5.mPrimaryOrientation
            int r1 = r1.getEndAfterPadding()
            androidx.recyclerview.widget.OrientationHelper r2 = r5.mPrimaryOrientation
            int r6 = r2.getDecoratedEnd(r6)
            int r1 = r1 - r6
            if (r1 >= 0) goto Lbc
            r7.mOffset = r1
            return r0
        Lbc:
            r7.mOffset = r3
            goto Ld9
        Lbf:
            int r6 = r5.mPendingScrollPosition
            r7.mPosition = r6
            int r2 = r5.mPendingScrollPositionOffset
            if (r2 != r3) goto Ld4
            int r6 = r5.calculateScrollDirectionForPosition(r6)
            if (r6 != r0) goto Lce
            r1 = 1
        Lce:
            r7.mLayoutFromEnd = r1
            r7.assignCoordinateFromPadding()
            goto Ld7
        Ld4:
            r7.assignCoordinateFromPadding(r2)
        Ld7:
            r7.mInvalidateOffsets = r0
        Ld9:
            return r0
        Lda:
            r5.mPendingScrollPosition = r2
            r5.mPendingScrollPositionOffset = r3
        Lde:
            return r1
    }

    void updateAnchorInfoForLayout(androidx.recyclerview.widget.RecyclerView.State r2, androidx.recyclerview.widget.StaggeredGridLayoutManager.AnchorInfo r3) {
            r1 = this;
            boolean r0 = r1.updateAnchorFromPendingData(r2, r3)
            if (r0 == 0) goto L7
            goto Ld
        L7:
            boolean r2 = r1.updateAnchorFromChildren(r2, r3)
            if (r2 == 0) goto Le
        Ld:
            return
        Le:
            r3.assignCoordinateFromPadding()
            r2 = 0
            r3.mPosition = r2
            return
    }

    void updateMeasureSpecs(int r2) {
            r1 = this;
            int r0 = r1.mSpanCount
            int r0 = r2 / r0
            r1.mSizePerSpan = r0
            androidx.recyclerview.widget.OrientationHelper r0 = r1.mSecondaryOrientation
            int r0 = r0.getMode()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r1.mFullSizeSpec = r2
            return
    }
}
