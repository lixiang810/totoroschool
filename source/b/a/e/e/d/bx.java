package b.a.e.e.d;

import b.a.b.b;
import b.a.e.a.d;
import b.a.k;
import b.a.q;
import b.a.s;

public final class bx<T>
  extends a<T, k<T>>
{
  public bx(q<T> paramq)
  {
    super(paramq);
  }
  
  public void subscribeActual(s<? super k<T>> params)
  {
    this.a.subscribe(new a(params));
  }
  
  static final class a<T>
    implements b, s<T>
  {
    final s<? super k<T>> a;
    b b;
    
    a(s<? super k<T>> params)
    {
      this.a = params;
    }
    
    public void dispose()
    {
      this.b.dispose();
    }
    
    public boolean isDisposed()
    {
      return this.b.isDisposed();
    }
    
    public void onComplete()
    {
      k localk = k.f();
      this.a.onNext(localk);
      this.a.onComplete();
    }
    
    public void onError(Throwable paramThrowable)
    {
      paramThrowable = k.a(paramThrowable);
      this.a.onNext(paramThrowable);
      this.a.onComplete();
    }
    
    public void onNext(T paramT)
    {
      this.a.onNext(k.a(paramT));
    }
    
    public void onSubscribe(b paramb)
    {
      if (d.validate(this.b, paramb))
      {
        this.b = paramb;
        this.a.onSubscribe(this);
      }
    }
  }
}


/* Location:              C:\Users\lixia\Desktop\android反编译三件套\dex2jar-2.0\classes-dex2jar.jar!\b\a\e\e\d\bx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */