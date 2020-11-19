import java.awt.*;
import java.awt.event.*;
public class Register extends Frame implements ActionListener//By default it is Border Layout
{
    //data members
    String output,fn,ln,email,day,month,year,addr,contact;
    boolean java,python,ruby,javascript;
    Checkbox c=new Checkbox();
    Button b=new Button("Submit"),re=new Button("Refresh"),ud=new Button("Undo");
    Label fnl=new Label("First Name"),gl=new Label("Gender");
    Label lnl=new Label("Last Name"),el=new Label("Email");
    Label al=new Label("Address"),dl=new Label("Date of Birth"),cnl=new Label("Contact No."),ll=new Label("Language/s");;
    TextField fntxt=new TextField(20),lntxt=new TextField(20);
    TextField etxt=new TextField(20),atxt=new TextField(20),cntxt=new TextField(20);
    CheckboxGroup cbg=new CheckboxGroup();
    Checkbox ma=new Checkbox("Male",false,cbg),fma=new Checkbox("Female",false,cbg),o=new Checkbox("Other",false,cbg);
    Checkbox j=new Checkbox("Java"),p=new Checkbox("Python"),r=new Checkbox("Ruby"),js=new Checkbox("JavaScript");
    Choice d=new Choice(),m=new Choice(),y=new Choice();
    TextArea txta=new TextArea(200,150);
    Register()
    {
        setSize(1200,600);
        setVisible(true);
        setLocation(100,100);
        setBackground(Color.YELLOW);
        setForeground(Color.BLACK);
        setFont(new Font("Calibri",Font.PLAIN,20));
        setLayout(null);
        //Label of First Name
        fnl.setSize(115,30);
        fnl.setLocation(20,40);
        fnl.setForeground(Color.RED);
        add(fnl);
        //Label of Last Name
        lnl.setSize(115,30);
        lnl.setLocation(20,80);
        lnl.setForeground(Color.RED);
        add(lnl);
        //Label of Email
        el.setSize(115,30);
        el.setLocation(20,120);
        el.setForeground(Color.RED);
        add(el);
        //Label of Contact No.
        cnl.setSize(115,30);
        cnl.setLocation(20,160);
        cnl.setForeground(Color.RED);
        add(cnl);
        //Label of Address
        al.setSize(115,30);
        al.setLocation(20,200);
        al.setForeground(Color.RED);
        add(al);
        //TextField of First Name
        fntxt.setSize(200,30);
        fntxt.setLocation(150,40);
        fntxt.setForeground(Color.BLUE);
        add(fntxt);
        //TextField of Last Name
        lntxt.setSize(200,30);
        lntxt.setLocation(150,80);
        lntxt.setForeground(Color.BLUE);
        add(lntxt);
        //TextField of Email
        etxt.setSize(300,30);
        etxt.setLocation(150,120);
        etxt.setForeground(Color.BLUE);
        add(etxt);
        //TextField of Contact No.
        cntxt.setSize(200,30);
        cntxt.setLocation(150,160);
        cntxt.setForeground(Color.BLUE);
        add(cntxt);
        //TextField of Address
        atxt.setSize(500,30);
        atxt.setLocation(150,200);
        atxt.setForeground(Color.BLUE);
        atxt.setFont(new Font("Calibri",Font.PLAIN,17));
        add(atxt);
        //Label of Date of Birth
        dl.setSize(115,30);
        dl.setLocation(20,240);
        dl.setForeground(Color.RED);
        add(dl);
        //Adding choices to day
        for(int i=1;i<=31;i++)
            d.add(""+i);
        //Adding choices to month
        for(int i=1;i<=12;i++)
            m.add(""+i);
        //Adding choices to Year
        for(int i=1990;i<=2020;i++)
            y.add(""+i);
        //Choice of Day of Birth
        d.setSize(50,30);
        d.setLocation(150,240);
        d.setBackground(Color.white);
        add(d);
        //Choice of Month of Birth
        m.setSize(50,30);
        m.setLocation(210,240);
        m.setBackground(Color.white);
        add(m);
        //Choice of Year of Birth
        y.setSize(80,30);
        y.setLocation(270,240);
        y.setBackground(Color.white);
        add(y);
        //Label of Gender
        gl.setSize(115,30);
        gl.setLocation(20,280);
        gl.setForeground(Color.RED);
        add(gl);
        //Checkbox(Radial Button) of Male
        ma.setSize(80,30);
        ma.setLocation(150,280);
        ma.setForeground(Color.BLUE);
        add(ma);
        //Checkbox(Radial Button) of Female
        fma.setSize(80,30);
        fma.setLocation(150,310);
        fma.setForeground(Color.BLUE);
        add(fma);
        //Checkbox(Radial Button) of Other
        o.setSize(80,30);
        o.setLocation(150,340);
        o.setForeground(Color.BLUE);
        add(o);
        //Label of Language/s
        ll.setSize(115,30);
        ll.setLocation(20,380);
        ll.setForeground(Color.RED);
        add(ll);
        //Checkbox of Java
        j.setSize(80,30);
        j.setLocation(150,380);
        j.setForeground(Color.BLUE);
        add(j);
        //Checkbox of Python
        p.setSize(80,30);
        p.setLocation(230,380);
        p.setForeground(Color.BLUE);
        add(p);
        //Checkbox of Ruby
        r.setSize(80,30);
        r.setLocation(150,410);
        r.setForeground(Color.BLUE);
        add(r);
        //Checkbox of JavaScript
        js.setSize(110,30);
        js.setLocation(230,410);
        js.setForeground(Color.BLUE);
        add(js);
        //Submit Button
        b.setSize(100,40);
        b.setLocation(140,480);
        b.setForeground(Color.BLACK);
        b.setBackground(Color.CYAN);
        b.setFont(new Font("Calibri",Font.PLAIN,30));
        add(b);
        b.addActionListener(this);
        //Refresh Button
        re.setSize(120,40);
        re.setLocation(260,480);
        re.setForeground(Color.BLACK);
        re.setBackground(Color.CYAN);
        re.setFont(new Font("Calibri",Font.PLAIN,30));
        add(re);
        re.addActionListener(this);
        //Undo Button
        ud.setSize(100,40);
        ud.setLocation(20,480);
        ud.setForeground(Color.BLACK);
        ud.setBackground(Color.CYAN);
        ud.setFont(new Font("Calibri",Font.PLAIN,30));
        add(ud);
        ud.addActionListener(this);
        //Text Area to Display
        txta.setSize(500,525);
        txta.setLocation(675,50);
        add(txta);
        addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent e)
                {
                    System.exit(0);
                }//windowClosing ends
            }//Anonymous class ends
        );
    }//constuctor ends
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b)
        {
            fn=fntxt.getText();
            ln=lntxt.getText();
            email=etxt.getText();
            contact=cntxt.getText();
            addr=atxt.getText();
            output="Name:"+fn+" "+ln+"\n"+"Email:"+email+"\n"+"Contact No.:"+contact+"\n";
            output+="Address:";
            String addrcop=addr;
            int ct=0;
            while(true)
            {
                if(ct==0)
                {
                    output+=addrcop.substring(0,addrcop.indexOf(',')+1)+"\n";
                    addrcop=addrcop.substring(addrcop.indexOf(',')+1);
                    ct=1;
                }//if ends
                else if(addrcop.indexOf(',')!=-1)
                {
                    output+="\t      "+addrcop.substring(0,addrcop.indexOf(',')+1)+"\n";
                    addrcop=addrcop.substring(addrcop.indexOf(',')+1);
                }//else if ends
                else
                {
                    output+="\t      "+addrcop+"\n";
                    break;
                }//else ends
            }//while ends
            day=d.getSelectedItem();
            month=m.getSelectedItem();
            year=y.getSelectedItem();
            output+="Date of Birth:"+day+"/"+month+"/"+year+"\n";
            if(cbg.getSelectedCheckbox()==ma)
            output+="Gender:Male\n";
            else if(cbg.getSelectedCheckbox()==fma)
            output+="Gender:Female\n";
            else if(cbg.getSelectedCheckbox()==o)
            output+="Gender:Others\n";
            output+="Language/s:";
            if(j.getState())
            output+=j.getLabel()+",";
            if(p.getState())
            output+=p.getLabel()+",";
            if(r.getState())
            output+=r.getLabel()+",";
            if(js.getState())
            output+=js.getLabel()+",";
            if(!(j.getState() || p.getState() || r.getState() || js.getState()))
            {
                output=output.substring(0,output.lastIndexOf('L'));
                output+=",";
            }//if ends
            output=output.substring(0,output.lastIndexOf(','));
            txta.setText(output);
            remove(b);
        }//if ends
        else if(e.getSource()==re)
        {
            add(b);
            fn=fntxt.getText();
            fntxt.setText("");
            ln=lntxt.getText();
            lntxt.setText("");
            email=etxt.getText();
            etxt.setText("");
            addr=atxt.getText();
            atxt.setText("");
            contact=cntxt.getText();
            cntxt.setText("");
            day=d.getSelectedItem();
            d.select(0);
            month=m.getSelectedItem();
            m.select(0);
            year=y.getSelectedItem();
            y.select(0);
            txta.setText("");
            c=cbg.getSelectedCheckbox();
            cbg.setSelectedCheckbox(null);
            java=j.getState();
            j.setState(false);
            python=p.getState();
            p.setState(false);
            ruby=r.getState();
            r.setState(false);
            javascript=js.getState();
            js.setState(false);
        }//else if ends
        else if(e.getSource()==ud)
        {
            txta.setText(output);
            fntxt.setText(fn);
            lntxt.setText(ln);
            etxt.setText(email);
            cntxt.setText(contact);
            atxt.setText(addr);
            d.select(day);
            m.select(month);
            y.select(year);
            cbg.setSelectedCheckbox(c);
            j.setState(java);
            p.setState(python);
            r.setState(ruby);
            js.setState(javascript);
        }//else if ends
    }//actionPerformed ends
    public static void main()
    {
        new Register();
    }//main ends
}//class ends