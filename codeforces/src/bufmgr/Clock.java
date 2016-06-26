package bufmgr;

/**
 * The "Clock" replacement policy.
 */
class Clock extends Replacer {

  //
  // Frame State Constants
  //
  protected static final int AVAILABLE = 10;
  protected static final int REFERENCED = 11;
  protected static final int PINNED = 12;

  /** Clock head; required for the default clock algorithm. */
  protected int head;

  // --------------------------------------------------------------------------

  /**
   * Constructs a clock replacer.
   */
  public Clock(BufMgr bufmgr) {
    super(bufmgr);

    // initialize the frame states
    for (int i = 0; i < frametab.length; i++) {
      frametab[i].state = AVAILABLE;
    }

    // initialize the clock head
    head = -1;

  } // public Clock(BufMgr bufmgr)

  /**
   * Notifies the replacer of a new page.
   */
  public void newPage(FrameDesc fdesc) {
    // no need to update frame state
  }

  /**
   * Notifies the replacer of a free page.
   */
  public void freePage(FrameDesc fdesc) {
    fdesc.state = AVAILABLE;
  }

  /**
   * Notifies the replacer of a pined page.
   */
  public void pinPage(FrameDesc fdesc) {

  }

  /**
   * Notifies the replacer of an unpinned page.
   */
  public void unpinPage(FrameDesc fdesc) {

  }

  /**
   * Selects the best frame to use for pinning a new page.
   * 
   * @return victim frame number, or -1 if none available
   */
  public int pickVictim() {
    int i = 0;
    int j = mgr.getNumBuffers();
    
    head = ((head + 1) % j);
    while (state_bit[head].state != PINNED)
    {
      if (state_bit[head].state == 13) {
        state_bit[head].state = PINNED;
      }
      if (i == 2 * j) {
        throw new BufferPoolExceededException(null, "BUFMGR: BUFFER_EXCEEDED.");
      }
      i++;
      head = ((head + 1) % j);
    }
    if (mgr.frameTable()[head].pin_count() != 0) {
      throw new PagePinnedException(null, "BUFMGR: PIN_COUNT IS NOT 0.");
    }
    state_bit[head].state = 14;
    mgr.frameTable()[this.head].pin();
    
    // keep track of the number of tries
    // return the victim page
      return head;  //for compilation

  } // public int pick_victim()

} // class Clock extends Replacer
