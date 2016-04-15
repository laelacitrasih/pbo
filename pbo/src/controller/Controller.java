package controller;
import java.awt.event.ActionEvent;
import model.*;
import view.*;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Date;
import javafx.application.Application;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Controller extends MouseAdapter implements ActionListener {
    private Aplikasi model;
    private PanelContainer view;

    private String currentView;
    private JPanel mainPanel;

    private Login a;
    private MainMenu1 a1;
    private CreateKelompokTA a11;
    private DeleteKelompokTA a12;
    private FindKelompokTA a13;
    private AddMember a14;
    private DeleteMember a15;
    private FindMember a16;
    private MainMenu2 a2;
    private CreateTA a21;
    private SetPembimbing a22;
    private GetPembimbing a23;
    
    private Dosen d;
    private Mahasiswa m;
    
    public Controller(Aplikasi model) {
        this.model = model;
        this.view = new PanelContainer();

        a = new Login();
        a1 = new MainMenu1();
        a11 = new CreateKelompokTA();
        a12 = new DeleteKelompokTA();
        a13 = new FindKelompokTA();
        a14 = new AddMember();
        a15 = new DeleteMember();
        a16 = new FindMember();
        a2 = new MainMenu2();
        a21 = new CreateTA();
        a22 = new SetPembimbing();
        a23 = new GetPembimbing();

        a.addListener(this);
        a1.addListener(this);
        a11.addListener(this);
        a12.addListener(this);
        a13.addListener(this);
        a14.addListener(this);
        a15.addListener(this);
        a16.addListener(this);
        a2.addListener(this);
        a21.addListener(this);
        a22.addListener(this);
        a23.addListener(this);
        a14.addAdapter(this);
        

        mainPanel = view.getMainPanel();
        mainPanel.add(a, "0");
        mainPanel.add(a1, "1");
        mainPanel.add(a11, "2");
        mainPanel.add(a12, "3");
        mainPanel.add(a13, "4");
        mainPanel.add(a14, "5");
        mainPanel.add(a15, "6");
        mainPanel.add(a16, "7");
        mainPanel.add(a2, "8");
        mainPanel.add(a21, "9");
        mainPanel.add(a22, "10");
        mainPanel.add(a23, "11");
        currentView = "0";

        view.getCardLayout()
                .show(mainPanel, currentView);
        view.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (currentView.equals("0")){
            if (source.equals(a.getSubmitButton())) {
                String user = a.getUserField();
                String pass = a.getPassField();
                if (model.Menu01(user, pass) instanceof Dosen){
                    d = (Dosen) model.Menu01(user, pass);
                    currentView = "1";
                    view.getCardLayout().show(mainPanel, currentView);
                } else if (model.Menu01(user, pass) instanceof Mahasiswa){
                    m = (Mahasiswa) model.Menu01(user, pass);
                    currentView = "8";
                    view.getCardLayout().show(mainPanel, currentView);
                } else {
                    JOptionPane.showMessageDialog(mainPanel, "Username or Password invalid");
                }
            }
        } else if (currentView.equals("1")) {
            //current view = Main Menu 1 (Dosen)
            if (source.equals(a1.getCreateKelompokTAButton())) {
                a11.setListIsi(model.getAllTA(d));
                currentView = "2";
                view.getCardLayout().show(mainPanel, currentView);
            } else if (source.equals(a1.getDeleteKelompokTAButton())) {
                a12.setListIsi(model.getAllTA(d));
                currentView = "3";
                view.getCardLayout().show(mainPanel, currentView);
            } else if (source.equals(a1.getFindKelompokTAButton())) {
                a13.setListIsi(model.getAllTA(d));
                currentView = "4";
                view.getCardLayout().show(mainPanel, currentView);
            } else if (source.equals(a1.getAddMemberButton())) {
                a14.setListIsi(model.getAllTA(d));
                a14.setListNim(model.getNIMMhs());
                currentView = "5";
                view.getCardLayout().show(mainPanel, currentView);
            } else if (source.equals(a1.getDeleteMemberButton())) {
                currentView = "6";
                view.getCardLayout().show(mainPanel, currentView);
            } else if (source.equals(a1.getFindMemberButton())) {
                currentView = "7";
                view.getCardLayout().show(mainPanel, currentView);
            }
        } else if (currentView.equals("2")) {
            //current view = Create Kelompok TA
            if (source.equals(a11.getBackButton())) {
                currentView = "1";
                view.getCardLayout().show(mainPanel, currentView);
            } else if (source.equals(a11.getAddButton())) {
                String topik = a11.getNamaTopikTATextField();
                model.Menu11(d, topik);
                a11.reset();
                a11.setListIsi(model.getAllTA(d));
            }
        } else if (currentView.equals("3")) {
            //current view = Delete Kelompok TA
            if (source.equals(a12.getBackButton())) {
                currentView = "1";
                view.getCardLayout().show(mainPanel, currentView);
            } else if (source.equals(a12.getDeleteButton())) {
                String n = a12.getNomorTopikTATextField();
                model.Menu12(d, Integer.parseInt(n)-1);
                a12.reset();
                a12.setListIsi(model.getAllTA(d));
            } 
        } else if (currentView.equals("4")) {
            //current view = Find Kelompok TA
            if (source.equals(a13.getBackButton())) {
                currentView = "1";
                view.getCardLayout().show(mainPanel, currentView);
            } else if (source.equals(a13.getFindButton())) {
                String n = a13.getNomorTopikTATextField();
                String[] s = new String[1];
                if (model.Menu13(d, Integer.parseInt(n)-1)!=null)
                    s[0] = model.Menu13(d, Integer.parseInt(n)-1).getTopik();   
                a13.reset();
                a13.setListHasil(s);
            } 
        } else if (currentView.equals("5")) {
            //current view = Add Member
            if (source.equals(a14.getBackButton())) {
                currentView = "1";
                view.getCardLayout().show(mainPanel, currentView);
            } else if (source.equals(a14.getAddButton())) {
                int n = a14.getNomorTopikTATextField();
                String m = a14.getNIMTextField();
                model.Menu14(d, n-1, model.getMahasiswa(m));
                a14.reset();
                a14.setListIsi(model.getAllTA(d));
            } 
        } else if (currentView.equals("6")) {
            //current view = Delete Member
            if (source.equals(a15.getBackButton())) {
                currentView = "1";
                view.getCardLayout().show(mainPanel, currentView);
            } else if (source.equals(a15.getDeleteButton())) {
                //model.Menu11(d, topik);
                a15.reset();
            } 
        } else if (currentView.equals("7")) {
            //current view = Find Member
            if (source.equals(a16.getBackButton())) {
                currentView = "1";
                view.getCardLayout().show(mainPanel, currentView);
            } else if (source.equals(a16.getFindButton())) {
                //model.Menu11(d, topik);
                a16.reset();
            } 
        } else if (currentView.equals("8")) {
            //current view = Main Menu 1 (Dosen)
            if (source.equals(a2.getCreateTAButton())) {
                currentView = "9";
                view.getCardLayout().show(mainPanel, currentView);
            } else if (source.equals(a2.getSetPembimbingButton())) {
                currentView = "10";
                view.getCardLayout().show(mainPanel, currentView);
            } else if (source.equals(a2.getGetPembimbingButton())) {
                currentView = "11";
                view.getCardLayout().show(mainPanel, currentView);
            }
        } else if (currentView.equals("9")) {
            //current view = Create TA
            if (source.equals(a21.getBackButton())) {
                currentView = "8";
                view.getCardLayout().show(mainPanel, currentView);
            } else if (source.equals(a21.getAddButton())) {
                //model.Menu11(d, topik);
                a21.reset();
            }
        } else if (currentView.equals("10")) {
            //current view = Set Pembimbing
            if (source.equals(a22.getBackButton())) {
                currentView = "8";
                view.getCardLayout().show(mainPanel, currentView);
            } else if (source.equals(a22.getSetButton())) {
                //model.Menu11(d, topik);
                a22.reset();
            }
        } else if (currentView.equals("11")) {
            //current view = Create TA
            if (source.equals(a23.getBackButton())) {
                currentView = "8";
                view.getCardLayout().show(mainPanel, currentView);
            } else if (source.equals(a23.getGetButton())) {
                //model.Menu11(d, topik);
                a23.reset();
            }
        }
    }
    public void mousePressed(MouseEvent e) {
        Object source = e.getSource();
        if (currentView.equals("5")) {
            String topikSelected = a14.getSelectedIsi();
            if (topikSelected != null) {
                a14.setSelectedIsiDetail(d.GetKelompok(topikSelected).toString());
            }
        }
    }
}