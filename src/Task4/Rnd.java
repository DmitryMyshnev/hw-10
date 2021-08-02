package Task4;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Rnd {
    private  long seed =10l;
   private static final long a = 25214903917l;
   private static final long c = 11l;
   private static final long m = (1L << 48) - 1;

    public long nextLine(){
        long oldSeed, nextSeed;
        oldSeed = seed;
        nextSeed = (a* oldSeed +c) % m;
        seed = nextSeed;
        return  nextSeed ;
    }
}
